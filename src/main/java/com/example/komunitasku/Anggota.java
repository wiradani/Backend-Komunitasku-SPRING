package com.example.komunitasku;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "anggota")
public class Anggota extends User {
    private Integer jumlah_event;
    private  String title;
    private  Long xp;
    private  Long points;

    public Anggota() {
    }

    public Anggota(String name, String username, String password, String email, Boolean role, Integer jumlah_event, String title, Long xp, Long points) {
        super(name, username, password, email, role);
        this.jumlah_event = jumlah_event;
        this.title = title;
        this.xp = xp;
        this.points = points;
    }

    public Integer getJumlah_event() {
        return jumlah_event;
    }

    public void setJumlah_event(Integer jumlah_event) {
        this.jumlah_event = jumlah_event;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getXp() {
        return xp;
    }

    public void setXp(Long xp) {
        this.xp = xp;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
}
