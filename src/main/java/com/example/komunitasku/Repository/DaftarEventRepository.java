package com.example.komunitasku.Repository;

import com.example.komunitasku.model.DaftarEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DaftarEventRepository extends JpaRepository<DaftarEvent,Long> {
}
