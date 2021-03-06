package com.example.komunitasku.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "komunitas")
public class Komunitas {

    @ManyToMany(mappedBy = "komunitass")
    private Set<User> userss = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_komunitas")
    private Long id;

    private String name;
    private String deskripsi;

    public Komunitas() {
    }

    public Komunitas(Long id, String name, String deskripsi) {
        this.id = id;
        this.name = name;
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

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
