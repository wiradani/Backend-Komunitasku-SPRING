package com.example.komunitasku;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaftarKomunitasRepository extends JpaRepository<DaftarKomunitas,Long> {
}
