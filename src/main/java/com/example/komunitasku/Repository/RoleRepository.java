package com.example.komunitasku.Repository;


import com.example.komunitasku.model.Anggota;
import com.example.komunitasku.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByUsernameContaining(String username);
}