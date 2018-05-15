package com.example.komunitasku;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "pengajar")
public class Pengajar extends User {
    private Integer jumlah_mengajar;

    public Pengajar() {
    }

    public Pengajar(Set<Komunitas> komunitass, String name, String username, String password, String email, Integer jumlah_mengajar) {
        super(komunitass, name, username, password, email);
        this.jumlah_mengajar = jumlah_mengajar;
    }

    public Integer getJumlah_mengajar() {
        return jumlah_mengajar;
    }

    public void setJumlah_mengajar(Integer jumlah_mengajar) {
        this.jumlah_mengajar = jumlah_mengajar;
    }
}
