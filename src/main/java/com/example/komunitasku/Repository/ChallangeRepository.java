package com.example.komunitasku.Repository;

import com.example.komunitasku.model.Challange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallangeRepository extends JpaRepository<Challange,Long> {
}
