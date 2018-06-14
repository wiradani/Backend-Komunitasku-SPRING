package com.example.komunitasku.Repository;

import com.example.komunitasku.model.Pengajar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PengajarRepository extends JpaRepository<Pengajar,Long> {
}
