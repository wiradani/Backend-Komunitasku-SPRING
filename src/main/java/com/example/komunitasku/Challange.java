package com.example.komunitasku;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "challange")
public class Challange extends Event {
    private Long pembuat;
    private String link_submisi;
    private String waktu_mulai;
    private String waktu_selesail;

    public Challange() {
    }

    public Challange(String nama, String deskripsi, Integer reward_xp, Integer reward_points, Long pembuat, String link_submisi, String waktu_mulai, String waktu_selesail) {
        super(nama, deskripsi, reward_xp, reward_points);
        this.pembuat = pembuat;
        this.link_submisi = link_submisi;
        this.waktu_mulai = waktu_mulai;
        this.waktu_selesail = waktu_selesail;
    }

    public Long getPembuat() {
        return pembuat;
    }

    public void setPembuat(Long pembuat) {
        this.pembuat = pembuat;
    }

    public String getLink_submisi() {
        return link_submisi;
    }

    public void setLink_submisi(String link_submisi) {
        this.link_submisi = link_submisi;
    }

    public String getWaktu_mulai() {
        return waktu_mulai;
    }

    public void setWaktu_mulai(String waktu_mulai) {
        this.waktu_mulai = waktu_mulai;
    }

    public String getWaktu_selesail() {
        return waktu_selesail;
    }

    public void setWaktu_selesail(String waktu_selesail) {
        this.waktu_selesail = waktu_selesail;
    }
}
