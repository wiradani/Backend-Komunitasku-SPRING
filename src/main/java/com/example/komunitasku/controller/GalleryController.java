package com.example.komunitasku.controller;

import com.example.komunitasku.Repository.GalleryRepository;
import com.example.komunitasku.exceptionhandler.ResourceExceptionNotFound;
import com.example.komunitasku.model.Gallery;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GalleryController {
    private GalleryRepository galleryRepository;

    public GalleryController (GalleryRepository galleryRepository){
        this.galleryRepository=galleryRepository;
    }

    @GetMapping("/gallery")
    public List<Gallery> index(){
        return galleryRepository.findAll();
    }

    @GetMapping("/gallery/{id}")
    public Gallery show(@PathVariable(value = "id")Long id){
        return galleryRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
    }

    @PostMapping("/gallery")
    public  Gallery createGallery(@RequestBody Gallery gallery){
        return galleryRepository.save(gallery);
    }

    @PutMapping("/gallery/{id}")
    public  Gallery updateGallery(@PathVariable(value = "id")Long id,@RequestBody Gallery gallery) {
        Gallery gallery1=galleryRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        gallery1.setTitle(gallery.getTitle());
        gallery1.setBody(gallery.getBody());
        gallery1.setUrl(gallery.getUrl());
        gallery1.setLabel(gallery.getLabel());
        gallery1.setTime(gallery.getTime());
        return  galleryRepository.save(gallery1);
    }

    @DeleteMapping("/gallery/{id}")
    public void delete(@PathVariable(value = "id")Long id){
        Gallery gallery =galleryRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        galleryRepository.delete(gallery);
    }
}
