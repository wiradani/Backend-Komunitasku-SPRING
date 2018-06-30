package com.example.komunitasku.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "Gath")
public class Gath extends Event {

    private String materi;
    private String lokasi;
    private Long pengajar;

    public Gath() {
    }

    public Gath(Set<User> userss, Set<User> rsvpuser, String nama, String deskripsi, Integer reward_xp, Integer reward_points, String label, String time, String materi, String lokasi, Long pengajar) {
        super(userss, rsvpuser, nama, deskripsi, reward_xp, reward_points, label, time);
        this.materi = materi;
        this.lokasi = lokasi;
        this.pengajar = pengajar;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public Long getPengajar() {
        return pengajar;
    }

    public void setPengajar(Long pengajar) {
        this.pengajar = pengajar;
    }
}
