package com.example.komunitasku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RSVPController  {
    private RSVPRepository rsvpRepository;

    @Autowired
    public  RSVPController(RSVPRepository rsvpRepository){
        this.rsvpRepository=rsvpRepository;
    }

    @PostMapping("/RSVP")
    public RSVP joinRSVP(@RequestBody RSVP rsvp){
        return rsvpRepository.save(rsvp);
    }

    @GetMapping("/RSVP")
    public List<RSVP> index(){
        return rsvpRepository.findAll();
    }
}
