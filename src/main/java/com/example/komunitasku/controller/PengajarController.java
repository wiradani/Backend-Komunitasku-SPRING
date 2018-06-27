package com.example.komunitasku.controller;

import com.example.komunitasku.Repository.PengajarRepository;
import com.example.komunitasku.Repository.RoleRepository;
import com.example.komunitasku.exceptionhandler.ResourceExceptionNotFound;
import com.example.komunitasku.model.Pengajar;
import com.example.komunitasku.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PengajarController {

    private PengajarRepository pengajarRepository;
    private RoleRepository roleRepository;

    @Autowired
    public PengajarController(PengajarRepository pengajarRepository,RoleRepository roleRepository){
        this.pengajarRepository=pengajarRepository;
        this.roleRepository=roleRepository;
    }

    @GetMapping("/Pengajar")
    public List<Pengajar> index() {
        return  pengajarRepository.findAll();
    }

    @GetMapping("/Pengajar/{id}")
    public Pengajar show(@PathVariable(value = "id")Long id){
        return pengajarRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
    }

    @PostMapping("/Pengajar")
    public Pengajar createPengajar(@RequestBody Pengajar pengajar){
        //pengajar.setPassword(new BCryptPasswordEncoder().encode(pengajar.getPassword()));
        Role role = new Role(pengajar.getUsername(),"ROLE_ADMIN");
        roleRepository.save(role);
        return pengajarRepository.save(pengajar);
    }


    @PutMapping("/Pengajar/{id}")
    public Pengajar updatePengajar(@PathVariable(value = "id")Long id,@RequestBody Pengajar pengajarNew){
        Pengajar pengajarold = pengajarRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        pengajarold.setName(pengajarNew.getName());
        pengajarold.setEmail(pengajarNew.getEmail());
       // pengajarold.setPassword(new BCryptPasswordEncoder().encode(pengajarNew.getPassword()));
        return pengajarRepository.save(pengajarold);
    }

    @DeleteMapping("/Pengajar/{id}")
    public  void delete(@PathVariable(value = "id") Long id){
        Pengajar pengajar = pengajarRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        Role role = roleRepository.findByUsernameContaining(pengajar.getUsername());
        roleRepository.delete(role);
        pengajarRepository.delete(pengajar);
    }

}
