package com.example.komunitasku;

import javax.persistence.*;

@Entity
@Table(name = "daftar_penerma_rew")
public class DaftarPenerimaReward {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long reward_id;
    private Long user_id;

    public DaftarPenerimaReward() {
    }

    public DaftarPenerimaReward(Long id, Long reward_id, Long user_id) {
        this.id = id;
        this.reward_id = reward_id;
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReward_id() {
        return reward_id;
    }

    public void setReward_id(Long reward_id) {
        this.reward_id = reward_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
