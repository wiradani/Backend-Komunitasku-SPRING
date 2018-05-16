package com.example.komunitasku;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RewardsController {

    private RewardsRepository rewardsRepository;
    private AnggotaRepository anggotaRepository;

    @Autowired
    public RewardsController(RewardsRepository rewardsRepository, AnggotaRepository anggotaRepository) {
        this.rewardsRepository = rewardsRepository;
        this.anggotaRepository = anggotaRepository;
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

    @PutMapping("/giveReward/{id}/{idEv}")
    public Anggota giveRewards(@PathVariable(value = "id")Long id, @PathVariable(value = "idEv")Long idEv){
        Anggota points = anggotaRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        Rewards syaratpoints = rewardsRepository.findById(idEv).orElseThrow(()-> new ResourceExceptionNotFound("ID" + idEv.toString()+ "not found "));
        points.setPoints(points.getPoints() - syaratpoints.getSyaratPoint());
        return anggotaRepository.save(points);
    }

}
