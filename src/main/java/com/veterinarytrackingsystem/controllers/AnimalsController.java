package com.veterinarytrackingsystem.controllers;


import com.veterinarytrackingsystem.models.Animal;
import com.veterinarytrackingsystem.services.abstracts.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/animals/")
public class AnimalsController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("")
    public List<Animal> getAll(Model model){

        return this.animalService.getAll();
    }
    @GetMapping("getbyid/{id}")
    Animal getById(@PathVariable Integer  id){
        return  this.animalService.getById(id);
    }
    @PostMapping("add")
    public  Animal add(@RequestBody  Animal animal){
        return this.animalService.add(animal);
    }
    @PutMapping("update")
    public Animal update(@RequestBody Animal animal){
        return this.animalService.update(animal);
    }
    @DeleteMapping("delete/{id}")
    public  boolean delete(@PathVariable Integer id){
        this.animalService.delete(id);
        return true;
    }

    @GetMapping("getByName")
    public List<Animal> findByName(String name){
        return  this.animalService.findByName(name);
    }
     @GetMapping("getbyanimalownerfirstname")
    public List<Animal> findByAnimalOwnerFirstName(String firstname){
       return this.animalService.findByAnimalOwner_FirstName(firstname);
    }
}
