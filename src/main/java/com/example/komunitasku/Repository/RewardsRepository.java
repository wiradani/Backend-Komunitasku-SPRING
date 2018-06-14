package com.example.komunitasku.Repository;

import com.example.komunitasku.model.Rewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardsRepository extends JpaRepository<Rewards,Long> {
}
