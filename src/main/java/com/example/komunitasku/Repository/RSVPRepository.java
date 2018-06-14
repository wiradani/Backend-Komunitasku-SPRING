package com.example.komunitasku.Repository;

import com.example.komunitasku.model.RSVP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSVPRepository extends JpaRepository<RSVP,Long> {
}
