package com.example.komunitasku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KomunitasController {
    private KomunitasRepository komunitasRepository;

    @Autowired
    public KomunitasController(KomunitasRepository komunitasRepository){
        this.komunitasRepository=komunitasRepository;
    }

    @GetMapping("/komunitas")
    public List<Komunitas> index(){return komunitasRepository.findAll();}

    @GetMapping("/komunitas/{id}")
    public Komunitas show(@PathVariable(value = "id")Long id){
        return komunitasRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
    }

    @PostMapping("/komunitas")
    public Komunitas createKomunitas(@RequestBody Komunitas komunitas){
        return komunitasRepository.save(komunitas);
    }

    @PutMapping("/komunitas/{id}")
    public Komunitas updateKomunitas(@PathVariable(value = "id")Long id,@RequestBody Komunitas newkomunitas){
        Komunitas komunitasold=komunitasRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        komunitasold.setName(newkomunitas.getName());
        komunitasold.setDeskripsi(newkomunitas.getDeskripsi());
        return komunitasRepository.save(komunitasold);
    }
}
