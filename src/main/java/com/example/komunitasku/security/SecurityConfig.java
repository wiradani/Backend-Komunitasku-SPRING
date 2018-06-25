package com.example.komunitasku.security;

import com.example.komunitasku.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username, password, enabled"
                        + " from user where username=?")
                .authoritiesByUsernameQuery("select username, authority "
                        + "from authorities where username=?")
                .passwordEncoder(new BCryptPasswordEncoder());
    }

//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser("test").password("test123").roles("USER").and()
//                .withUser("test1").password("test123").roles("ADMIN");
//    }

    @Override
    // Authorization : Role -> Access
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/komunitas").hasRole("ADMIN")
                    .antMatchers(HttpMethod.PUT, "/komunitas").hasRole("ADMIN")
                    .antMatchers(HttpMethod.GET, "/komunitas/**").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/Anggota").anonymous()
                    .antMatchers(HttpMethod.GET, "/Anggota/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.PUT, "/Anggota/**").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.DELETE, "/Anggota/**").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/Pengajar").hasRole("ADMIN")
                    .antMatchers(HttpMethod.GET, "/Pengajar/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.PUT, "/Pengajar/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.DELETE, "/Pengajar/**").hasRole("ADMIN")
                .and().csrf().disable().headers().frameOptions().disable();
    }

}
