package com.example.komunitasku;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EntityListeners(AuditingEntityListener.class)
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean tipe;
    private String nama;
    private String deskripsi;
    private Long reward_xp;
    private Long reward_points;
    private Date date;

    public Event() {
    }

    public Event(Boolean tipe, String nama, String deskripsi, Long reward_xp, Long reward_points, Date date) {
        this.tipe = tipe;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.reward_xp = reward_xp;
        this.reward_points = reward_points;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getTipe() {
        return tipe;
    }

    public void setTipe(Boolean tipe) {
        this.tipe = tipe;
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

    public Long getReward_xp() {
        return reward_xp;
    }

    public void setReward_xp(Long reward_xp) {
        this.reward_xp = reward_xp;
    }

    public Long getReward_points() {
        return reward_points;
    }

    public void setReward_points(Long reward_points) {
        this.reward_points = reward_points;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
