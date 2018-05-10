package com.example.komunitasku;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Event {
    @Id
    private Long id;

    private Boolean tipe;
    private String nama;
    private Date date;
    private Long reward_point;
    private Long reward_xp;
    private String deskripsi;

    public Event() {
    }

    public Event(Long id, Boolean tipe, String nama, Date date, Long reward_point, Long reward_xp, String deskripsi) {
        this.id = id;
        this.tipe = tipe;
        this.nama = nama;
        this.date = date;
        this.reward_point = reward_point;
        this.reward_xp = reward_xp;
        this.deskripsi = deskripsi;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getReward_point() {
        return reward_point;
    }

    public void setReward_point(Long reward_point) {
        this.reward_point = reward_point;
    }

    public Long getReward_xp() {
        return reward_xp;
    }

    public void setReward_xp(Long reward_xp) {
        this.reward_xp = reward_xp;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
