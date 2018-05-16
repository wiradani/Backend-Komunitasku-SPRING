package com.example.komunitasku;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Daftar_Komunitas",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = { @JoinColumn(name = "komunitas_id")}

    )
    protected Set<Komunitas> komunitass = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Daftar_Event",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = { @JoinColumn(name = "event_id")}

    )
    protected Set<Event> eventss = new HashSet<>();

    @ManyToMany(mappedBy = "rsvpuser")
    private Set<Event> rsvpevent = new HashSet<>();


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    protected   Long id;
    protected   String name;
    protected String username;
    protected   String password;
    protected   String email;


    public User() {
    }

    public User(Set<Komunitas> komunitass, Set<Event> eventss, String name, String username, String password, String email) {
        this.komunitass = komunitass;
        this.eventss = eventss;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Set<Komunitas> getKomunitass() {
        return komunitass;
    }

    public void setKomunitass(Set<Komunitas> komunitass) {
        this.komunitass = komunitass;
    }

    public Set<Event> getEventss() {
        return eventss;
    }

    public void setEventss(Set<Event> eventss) {
        this.eventss = eventss;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
