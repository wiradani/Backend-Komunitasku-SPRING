package com.example.komunitasku;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RewardsController {

    private RewardsRepository rewardsRepository;

    @Autowired
    public RewardsController(RewardsRepository rewardsRepository){
        this.rewardsRepository=rewardsRepository;
    }

    @GetMapping("/Rewards")
    public List<Rewards> index(){
        return rewardsRepository.findAll();
    }

    @GetMapping("/Rewards/{id}")
    public Rewards showshow(@PathVariable(value = "id")Long id){
        return rewardsRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
    }

    @PostMapping("/Rewards")
    public Rewards createRewards(@RequestBody Rewards rewards){
        return rewardsRepository.save(rewards);
    }

    @PutMapping("/Rewards/{id}")
    public  Rewards updateRewards(@PathVariable(value = "id")Long id,@RequestBody Rewards rewardsnew){
        Rewards rewardsold = rewardsRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        rewardsold.setName(rewardsnew.getName());
        rewardsold.setSyaratPoint(rewardsnew.getSyaratPoint());
        rewardsold.setDeskripsi(rewardsnew.getDeskripsi());
        return rewardsRepository.save(rewardsold);
    }

    @DeleteMapping("/Rewards/{id}")
    public void delete(@PathVariable(value = "id")Long id){
        Rewards rewards = rewardsRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        rewardsRepository.delete(rewards);
    }

}
