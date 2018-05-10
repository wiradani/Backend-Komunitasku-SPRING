package com.example.komunitasku;

import javax.persistence.Entity;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Challange extends Event {
    private Long id_challange;
    private Long pembuat;
    private Date waktu_mulai;
    private Date waktu_selesai;
    private String submisi;

    public Challange(Long id_challange, Long pembuat, Date waktu_mulai, Date waktu_selesai, String submisi) {
        this.id_challange = id_challange;
        this.pembuat = pembuat;
        this.waktu_mulai = waktu_mulai;
        this.waktu_selesai = waktu_selesai;
        this.submisi = submisi;
    }

    public Challange(Long id, Boolean tipe, String nama, java.util.Date date, Long reward_point, Long reward_xp, String deskripsi, Long id_challange, Long pembuat, Date waktu_mulai, Date waktu_selesai, String submisi) {
        super(id, tipe, nama, date, reward_point, reward_xp, deskripsi);
        this.id_challange = id_challange;
        this.pembuat = pembuat;
        this.waktu_mulai = waktu_mulai;
        this.waktu_selesai = waktu_selesai;
        this.submisi = submisi;
    }

    public Long getId_challange() {
        return id_challange;
    }

    public void setId_challange(Long id_challange) {
        this.id_challange = id_challange;
    }

    public Long getPembuat() {
        return pembuat;
    }

    public void setPembuat(Long pembuat) {
        this.pembuat = pembuat;
    }

    public Date getWaktu_mulai() {
        return waktu_mulai;
    }

    public void setWaktu_mulai(Date waktu_mulai) {
        this.waktu_mulai = waktu_mulai;
    }

    public Date getWaktu_selesai() {
        return waktu_selesai;
    }

    public void setWaktu_selesai(Date waktu_selesai) {
        this.waktu_selesai = waktu_selesai;
    }

    public String getSubmisi() {
        return submisi;
    }

    public void setSubmisi(String submisi) {
        this.submisi = submisi;
    }
}
