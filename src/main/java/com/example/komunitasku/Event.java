package com.example.komunitasku;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String nama;
    protected String deskripsi;
    protected Integer reward_xp;
    protected Integer reward_points;


    public Event() {
    }

    public Event(String nama, String deskripsi, Integer reward_xp, Integer reward_points) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.reward_xp = reward_xp;
        this.reward_points = reward_points;
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
