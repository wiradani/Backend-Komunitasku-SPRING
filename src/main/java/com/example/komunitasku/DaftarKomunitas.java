package com.example.komunitasku;

import javax.persistence.*;

@Entity
@Table(name = "daftar_komunitas")
public class DaftarKomunitas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long user_id;
    private Long komunitas_id;

    public DaftarKomunitas() {
    }

    public DaftarKomunitas(Long user_id, Long komunitas_id) {
        this.user_id = user_id;
        this.komunitas_id = komunitas_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getKomunitas_id() {
        return komunitas_id;
    }

    public void setKomunitas_id(Long komunitas_id) {
        this.komunitas_id = komunitas_id;
    }
}
