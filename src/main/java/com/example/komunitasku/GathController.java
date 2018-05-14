package com.example.komunitasku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class GathController {
    private GathRepository gathRepository;

    @Autowired
    public GathController(GathRepository gathRepository) {
        this.gathRepository = gathRepository;
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
        Gath gath = gathRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        gathRepository.delete(gath);
    }

    @PutMapping("/gath/{id}")
    public Gath updateGath(@PathVariable(value = "id")Long id,@RequestBody Gath body){
        Gath gath = gathRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        gath.setNama(body.getNama());
        gath.setDeskripsi(body.getDeskripsi());
        gath.setMateri(body.getMateri());
        gath.setLokasi(body.getLokasi());
        gath.setPengajar(body.getPengajar());
        gath.setReward_points(body.getReward_points());
        gath.setReward_xp(body.getReward_xp());
        return gathRepository.save(gath);

    }


}
