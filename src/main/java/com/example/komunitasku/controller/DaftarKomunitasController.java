package com.example.komunitasku.controller;

import com.example.komunitasku.Repository.DaftarKomunitasRepository;
import com.example.komunitasku.model.DaftarKomunitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DaftarKomunitasController {
    private DaftarKomunitasRepository daftarKomunitasRepository;

    @Autowired
    public  DaftarKomunitasController(DaftarKomunitasRepository daftarKomunitasRepository){
        this.daftarKomunitasRepository=daftarKomunitasRepository;
    }

    @PostMapping("/JoinKomunitas")
    public DaftarKomunitas joinKomunitas(@RequestBody DaftarKomunitas daftarKomunitas){
       return daftarKomunitasRepository.save(daftarKomunitas);
    }

    @GetMapping("/DaftarKomunitas")
    public List<DaftarKomunitas> index(){
        return daftarKomunitasRepository.findAll();
    }
}
