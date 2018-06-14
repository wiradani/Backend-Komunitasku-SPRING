package com.example.komunitasku.model;

import javax.persistence.*;

@Entity
@Table(name = "daftar_event")
public class DaftarEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long user_id;
    private Long event_id;

    public DaftarEvent() {
    }

    public DaftarEvent(Long user_id, Long event_id) {
        this.user_id = user_id;
        this.event_id = event_id;
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

    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }
}
