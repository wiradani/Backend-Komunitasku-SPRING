package com.example.komunitasku.controller;

import com.example.komunitasku.Repository.PengajarRepository;
import com.example.komunitasku.exceptionhandler.ResourceExceptionNotFound;
import com.example.komunitasku.model.Pengajar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PengajarController {

    private PengajarRepository pengajarRepository;

    @Autowired
    public PengajarController(PengajarRepository pengajarRepository){
        this.pengajarRepository=pengajarRepository;
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
        return pengajarRepository.save(pengajar);
    }


    @PutMapping("/Pengajar/{id}")
    public Pengajar updatePengajar(@PathVariable(value = "id")Long id,@RequestBody Pengajar pengajarNew){
        Pengajar pengajarold = pengajarRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        pengajarold.setName(pengajarNew.getName());
        pengajarold.setEmail(pengajarNew.getEmail());
        pengajarold.setPassword(pengajarNew.getPassword());
        return pengajarRepository.save(pengajarold);
    }

    @DeleteMapping("/Pengajar/{id}")
    public  void delete(@PathVariable(value = "id") Long id){
        Pengajar pengajar = pengajarRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        pengajarRepository.delete(pengajar);
    }

}
