package com.example.komunitasku;


import javax.persistence.*;

@Entity
@Table(name = "rewards")
public class Rewards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rewards")
    private Long id;

    private String name;
    private Long syaratPoint;
    private String deskripsi;

    public Rewards() {
    }

    public Rewards(Long id, String name, Long syaratPoint, String deskripsi) {
        this.id = id;
        this.name = name;
        this.syaratPoint = syaratPoint;
        this.deskripsi = deskripsi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSyaratPoint() {
        return syaratPoint;
    }

    public void setSyaratPoint(Long syaratPoint) {
        this.syaratPoint = syaratPoint;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
