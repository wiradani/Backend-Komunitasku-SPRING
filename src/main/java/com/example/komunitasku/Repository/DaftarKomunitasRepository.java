package com.example.komunitasku.Repository;

import com.example.komunitasku.model.DaftarKomunitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaftarKomunitasRepository extends JpaRepository<DaftarKomunitas,Long> {
}
