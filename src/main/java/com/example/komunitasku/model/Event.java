package com.example.komunitasku.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

    @ManyToMany(mappedBy = "eventss")
    private Set<User> userss = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "RSVP_Event",
            joinColumns = {@JoinColumn(name = "event_id")},
            inverseJoinColumns = { @JoinColumn(name = "user_id")}

    )
    protected Set<User> rsvpuser = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String nama;
    protected String deskripsi;
    protected Integer reward_xp;
    protected Integer reward_points;


    public Event() {
    }

    public Event(Set<User> userss, String nama, String deskripsi, Integer reward_xp, Integer reward_points) {
        this.userss = userss;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.reward_xp = reward_xp;
        this.reward_points = reward_points;
    }

    public Set<User> getUserss() {
        return userss;
    }

    public void setUserss(Set<User> userss) {
        this.userss = userss;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Integer getReward_xp() {
        return reward_xp;
    }

    public void setReward_xp(Integer reward_xp) {
        this.reward_xp = reward_xp;
    }

    public Integer getReward_points() {
        return reward_points;
    }

    public void setReward_points(Integer reward_points) {
        this.reward_points = reward_points;
    }
}
