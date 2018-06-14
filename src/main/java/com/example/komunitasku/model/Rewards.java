package com.example.komunitasku.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rewards")
public class Rewards {


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Daftar_Penerma_Rew",
            joinColumns = {@JoinColumn(name = "reward_id")},
            inverseJoinColumns = { @JoinColumn(name = "user_id")}

    )
    protected Set<User> daftarreward= new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rewards")
    private Long id;

    private String name;
    private Integer syaratPoint;
    private String deskripsi;

    public Rewards() {
    }

    public Rewards(String name, Integer syaratPoint, String deskripsi) {
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

    public Integer getSyaratPoint() {
        return syaratPoint;
    }

    public void setSyaratPoint(Integer syaratPoint) {
        this.syaratPoint = syaratPoint;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
