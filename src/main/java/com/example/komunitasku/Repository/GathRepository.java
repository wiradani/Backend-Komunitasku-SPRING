package com.example.komunitasku.Repository;

import com.example.komunitasku.model.Gath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GathRepository extends JpaRepository<Gath,Long> {
}
