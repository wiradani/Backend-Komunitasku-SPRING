package com.example.komunitasku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnggotaController {
    private AnggotaRepository anggotaRepository;
    private EventRepository eventRepository;
    private KomunitasRepository komunitasRepository;

    public AnggotaController(AnggotaRepository anggotaRepository, EventRepository eventRepository, KomunitasRepository komunitasRepository) {
        this.anggotaRepository = anggotaRepository;
        this.eventRepository = eventRepository;
        this.komunitasRepository = komunitasRepository;
    }

    @Autowired


    @GetMapping("/Anggota")
    public List<Anggota> index() {
        return  anggotaRepository.findAll();
    }

//    @GetMapping("/Anggota2")
//    public List<Anggota> index() {
//        User user = new User();
//        user.komunitass
//    }

    @GetMapping("/Anggota/{id}")
    public Anggota show(@PathVariable(value = "id")Long id){
        return anggotaRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
    }

    @PostMapping("/Anggota")
    public Anggota createAnggota(@RequestBody Anggota anggota){
        return anggotaRepository.save(anggota);
    }


    @PutMapping("/Anggota/{id}")
    public Anggota updateAnggota(@PathVariable(value = "id")Long id,@RequestBody Anggota anggotaNew){
       Anggota anggotaold = anggotaRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        anggotaold.setUsername(anggotaNew.getUsername());
        anggotaold.setName(anggotaNew.getName());
        anggotaold.setEmail(anggotaNew.getEmail());
        anggotaold.setPassword(anggotaNew.getPassword());
        anggotaold.setKomunitass(anggotaNew.getKomunitass());
        return anggotaRepository.save(anggotaold);
    }


    @DeleteMapping("/Anggota/{id}")
    public  void delete(@PathVariable(value = "id") Long id){
        Anggota  anggota = anggotaRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        anggotaRepository.delete(anggota);
    }

    @PutMapping("/title/{id}")
    public Anggota updatetitle(@PathVariable(value = "id")Long id){
        Anggota titleold=anggotaRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        if (titleold.getXp()<1000){
            titleold.setTitle("noob");
        }
        else if (titleold.getXp()<=2000){
            titleold.setTitle("Script Kiddes");
        }
        else if (titleold.getXp()<=3500){
            titleold.setTitle("Medium");
        }
        else if (titleold.getXp()<=5000){
            titleold.setTitle("Intermediate");
        }
        else if (titleold.getXp()<=7500){
            titleold.setTitle("Developer");
        }
        else if (titleold.getXp()<=10000){
            titleold.setTitle("pro");
        }
        else if (titleold.getXp()<=20000){
            titleold.setTitle("Mastah");
        }
        return anggotaRepository.save(titleold);
    }

    @PutMapping("/updatePoints/{id}/{idEv}")
    public Anggota updatePoints(@PathVariable(value = "id")Long id, @PathVariable(value = "idEv")Long idEv){
        Anggota pointsold = anggotaRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        Event rewadspoint = eventRepository.findById(idEv).orElseThrow(()-> new ResourceExceptionNotFound("ID" + idEv.toString()+ "not found "));
        pointsold.setPoints(pointsold.getPoints() + rewadspoint.getReward_points());
        return anggotaRepository.save(pointsold);
    }

    @PutMapping("/updateXP/{id}/{idEv}")
    public Anggota updateXP(@PathVariable(value = "id")Long id, @PathVariable(value = "idEv")Long idEv){
        Anggota xpold = anggotaRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        Event xppoint = eventRepository.findById(idEv).orElseThrow(()-> new ResourceExceptionNotFound("ID" + idEv.toString()+ "not found "));
        xpold.setXp(xpold.getXp() + xppoint.getReward_xp());
        return anggotaRepository.save(xpold);
    }

//    @PutMapping("/JoinKomunitas/{id}/{idKom}")
//    public Anggota joinKomunitas(@PathVariable(value = "id")Long id,@PathVariable(value = "idKom")Long idKom){
//        Anggota anggotaold = anggotaRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
//        Komunitas komunitasid = komunitasRepository.findById(idKom).orElseThrow(()-> new ResourceExceptionNotFound("ID" + idKom.toString()+ "not found "));
//        anggotaold.setKomunitass();
//        return anggotaRepository.save(anggotaold);
//    }


}
