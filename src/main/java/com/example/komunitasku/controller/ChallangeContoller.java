package com.example.komunitasku.controller;

import com.example.komunitasku.Repository.ChallangeRepository;
import com.example.komunitasku.exceptionhandler.ResourceExceptionNotFound;
import com.example.komunitasku.model.Challange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChallangeContoller {

    private ChallangeRepository challangeRepository;

    @Autowired
    public  ChallangeContoller(ChallangeRepository challangeRepository){
        this.challangeRepository=challangeRepository;
    }

    @GetMapping("/challange")
    public List<Challange> index(){
        return challangeRepository.findAll();
    }

    @GetMapping("/challange/{id}")
    public Challange showChal(@PathVariable(value = "id")Long id){
        return challangeRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
    }

    @PostMapping("/challange")
    public  Challange createChallange(@RequestBody Challange challange){
        return challangeRepository.save(challange);
    }

    @PutMapping("/challange/{id}")
    public Challange updateChallange(@PathVariable(value = "id")Long id,@RequestBody Challange challangenew){
        Challange challangeold=challangeRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        challangeold.setNama(challangenew.getNama());
        challangeold.setDeskripsi(challangenew.getDeskripsi());
        challangeold.setPembuat(challangenew.getPembuat());
        challangeold.setWaktu_mulai(challangenew.getWaktu_mulai());
        challangeold.setWaktu_selesail(challangenew.getWaktu_selesail());
        challangeold.setReward_points(challangenew.getReward_points());
        challangeold.setReward_xp(challangenew.getReward_xp());
        challangeold.setLink_submisi(challangenew.getLink_submisi());
        return challangeRepository.save(challangeold);
    }

    @DeleteMapping("/challange/{id}")
    public  void delete(@PathVariable(value = "id")Long id){
        Challange challange=challangeRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        challangeRepository.delete(challange);
    }



}
