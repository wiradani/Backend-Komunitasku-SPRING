package com.example.komunitasku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DaftarPenerimaRewardController {

    private DaftarPenerimaRewardRepository daftarPenerimaRewardRepository;

    @Autowired
    public DaftarPenerimaRewardController(DaftarPenerimaRewardRepository daftarPenerimaRewardRepository) {
        this.daftarPenerimaRewardRepository = daftarPenerimaRewardRepository;
    }

    @PostMapping("/inputReward")
    public DaftarPenerimaReward inputReward(@RequestBody DaftarPenerimaReward daftarPenerimaReward){
        return daftarPenerimaRewardRepository.save(daftarPenerimaReward);
    }

    @GetMapping("/DaftarPenerima")
    public List<DaftarPenerimaReward> index(){
        return daftarPenerimaRewardRepository.findAll();
    }
}
