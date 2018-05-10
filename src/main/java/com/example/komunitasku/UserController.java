package com.example.komunitasku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/User")
    public List<User> index() {
        return  userRepository.findAll();
    }

    @GetMapping("/User/{id}")
    public User show(@PathVariable(value = "id")Long id){
        return userRepository.findById(id).orElseThrow(() -> new ResourceExceptionNotFound(id.toString()));
    }

    @PostMapping("/User")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }


    @PutMapping("/User/{id}")
    public User updateUser(@PathVariable(value = "id")Long id,@RequestBody User userNew){
        User userold = userRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        userold.setEmail(userNew.getEmail());
        userold.setName(userNew.getName());
        userold.setPassword(userNew.getPassword());
        userold.setUsername(userNew.getUsername());
        return userRepository.save(userold);
    }

    @DeleteMapping("/User/{id}")
    public  void delete(@PathVariable(value = "id") Long id){
        User user = userRepository.findById(id).orElseThrow(()-> new ResourceExceptionNotFound("ID" + id.toString()+ "not found "));
        userRepository.delete(user);
    }


}
