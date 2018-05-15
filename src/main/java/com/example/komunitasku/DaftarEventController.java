package com.example.komunitasku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DaftarEventController {

    private DaftarEventRepository daftarEventRepository;

    @Autowired
    public  DaftarEventController(DaftarEventRepository daftarEventRepository){
        this.daftarEventRepository=daftarEventRepository;
    }

    @PostMapping("/JoinEvent")
    public DaftarEvent joinEvent(@RequestBody DaftarEvent daftarEvent){
        return daftarEventRepository.save(daftarEvent);
    }

    @GetMapping("/DaftarEvent")
    public List<DaftarEvent> index(){
        return daftarEventRepository.findAll();
    }
}
