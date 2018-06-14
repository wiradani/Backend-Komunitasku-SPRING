package com.example.komunitasku.Repository;

import com.example.komunitasku.model.Komunitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KomunitasRepository extends JpaRepository<Komunitas,Long> {
}
