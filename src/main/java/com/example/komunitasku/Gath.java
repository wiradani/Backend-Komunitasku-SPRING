package com.example.komunitasku;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Gath extends Event {
    private Long id_gath;
    private String materi;
    private String lokasi;
    private Long pengajar;

    public Gath(Long id_gath, String materi, String lokasi, Long pengajar) {
        this.id_gath = id_gath;
        this.materi = materi;
        this.lokasi = lokasi;
        this.pengajar = pengajar;
    }

    public Gath(Long id, Boolean tipe, String nama, Date date, Long reward_point, Long reward_xp, String deskripsi, Long id_gath, String materi, String lokasi, Long pengajar) {
        super(id, tipe, nama, date, reward_point, reward_xp, deskripsi);
        this.id_gath = id_gath;
        this.materi = materi;
        this.lokasi = lokasi;
        this.pengajar = pengajar;
    }

    public Long getId_gath() {
        return id_gath;
    }

    public void setId_gath(Long id_gath) {
        this.id_gath = id_gath;
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
