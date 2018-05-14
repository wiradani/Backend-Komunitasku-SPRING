package com.example.komunitasku;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pengajar")
public class Pengajar extends User {
    private Integer jumlah_mengajar;

    public Pengajar() {
    }

    public Pengajar(String name, String username, String password, String email, Boolean role, Integer jumlah_mengajar) {
        super(name, username, password, email, role);
        this.jumlah_mengajar = jumlah_mengajar;
    }

    public Integer getJumlah_mengajar() {
        return jumlah_mengajar;
    }

    public void setJumlah_mengajar(Integer jumlah_mengajar) {
        this.jumlah_mengajar = jumlah_mengajar;
    }
}
