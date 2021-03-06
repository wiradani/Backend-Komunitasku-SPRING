package com.example.komunitasku.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "pengajar")
public class Pengajar extends User {
    private Integer jumlah_mengajar;

    public Pengajar() {
    }


    public Pengajar(Set<Komunitas> komunitass, Set<Event> eventss, Set<Event> rsvpevent, Set<Rewards> daftaruserr, String name, String username, String password, String email, boolean enabled, String auth_token, Integer jumlah_mengajar) {
        super(komunitass, eventss, rsvpevent, daftaruserr, name, username, password, email, enabled, auth_token);
        this.jumlah_mengajar = jumlah_mengajar;
    }

    public Integer getJumlah_mengajar() {
        return jumlah_mengajar;
    }

    public void setJumlah_mengajar(Integer jumlah_mengajar) {
        this.jumlah_mengajar = jumlah_mengajar;
    }
}
