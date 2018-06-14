package com.example.komunitasku.Repository;

import com.example.komunitasku.model.DaftarPenerimaReward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaftarPenerimaRewardRepository extends JpaRepository<DaftarPenerimaReward,Long> {
}
