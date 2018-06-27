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
                    .antMatchers(HttpMethod.GET, "/komunitas").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.GET, "/komunitas/**").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/Anggota").anonymous()
                    .antMatchers(HttpMethod.GET, "/Anggota").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.GET, "/Anggota/**").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.PUT, "/Anggota/**").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.DELETE, "/Anggota/**").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.PUT, "/title/**").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.PUT, "/updatePoints/**").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.PUT, "/updateXP/**").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/Pengajar").hasRole("ADMIN")
                    .antMatchers(HttpMethod.GET, "/Pengajar").hasRole("ADMIN")
                    .antMatchers(HttpMethod.GET, "/Pengajar/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.PUT, "/Pengajar/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.DELETE, "/Pengajar/**").hasRole("ADMIN")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/Rewards").hasRole("ADMIN")
                    .antMatchers(HttpMethod.GET, "/Rewards").anonymous()
                    .antMatchers(HttpMethod.GET, "/Rewards/**").anonymous()
                    .antMatchers(HttpMethod.PUT, "/Rewards/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.DELETE, "/Rewards/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.PUT, "/giveReward/**").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/gath").hasRole("ADMIN")
                    .antMatchers(HttpMethod.GET, "/gath").anonymous()
                    .antMatchers(HttpMethod.GET, "/gath/**").anonymous()
                    .antMatchers(HttpMethod.PUT, "/gath/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.DELETE, "/gath/**").hasRole("ADMIN")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/challange").hasRole("ADMIN")
                    .antMatchers(HttpMethod.GET, "/challange").anonymous()
                    .antMatchers(HttpMethod.GET, "/challange/**").anonymous()
                    .antMatchers(HttpMethod.PUT, "/challange/**").hasRole("ADMIN")
                    .antMatchers(HttpMethod.DELETE, "/challange/**").hasRole("ADMIN")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/RSVP").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.GET, "/RSVP/**").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/uploadFile").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.POST, "/uploadMultipleFiles/**").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.GET, "/downloadFile//**").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/JoinEvent").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.GET, "/DaftarEvent").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/JoinKomunitas").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.GET, "/DaftarKomunitas").hasAnyRole("ADMIN","USER")
                .and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/inputReward").hasAnyRole("ADMIN","USER")
                    .antMatchers(HttpMethod.GET, "/DaftarPenerima").hasAnyRole("ADMIN","USER")
                .and().csrf().disable().headers().frameOptions().disable();
    }

}
