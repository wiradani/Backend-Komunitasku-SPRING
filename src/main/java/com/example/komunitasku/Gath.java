package com.example.komunitasku;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Gath")
public class Gath extends Event {

    private String materi;
    private String lokasi;
    private Long pengajar;

    public Gath() {
    }

    public Gath(String nama, String deskripsi, Integer reward_xp, Integer reward_points, String materi, String lokasi, Long pengajar) {
        super(nama, deskripsi, reward_xp, reward_points);
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
