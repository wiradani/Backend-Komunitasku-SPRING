package com.example.komunitasku;

import org.hibernate.cfg.annotations.reflection.XMLContext;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "anggota")
public class Anggota extends User {
    private Integer jumlah_event ;
    private  String title ;
    private  Integer xp ;
    private Integer points;

    public Anggota() {
        jumlah_event = xp = points =0;
        title = "noob";
        role = true;
    }

    public Anggota(String name, String username, String password, String email, Boolean role, Integer jumlah_event, String title, Integer xp, Integer points) {
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

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
