package com.example.komunitasku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GathController {
    private GathRepository gathRepository;

    @Autowired
    public GathController(GathRepository gathRepository){
        this.gathRepository=gathRepository;
    }

    @GetMapping("/gath")
    public List<Gath> index(){
        return gathRepository.findAll();
    }

    @GetMapping("/gath/{id}")
    public Gath show(@PathVariable(value = "id")Long id){
        return gathRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
    }

    @PostMapping("/gath")
    public Gath createGath(@RequestBody Gath gath){
        return gathRepository.save(gath);
    }

    @DeleteMapping("/gath/{id}")
    public  void delete(@PathVariable(value = "id")Long id){
        Gath gath = gathRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
        gathRepository.delete(gath);
    }


}
