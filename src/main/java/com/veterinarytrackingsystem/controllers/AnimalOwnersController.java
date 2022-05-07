package com.veterinarytrackingsystem.controllers;

import com.veterinarytrackingsystem.models.AnimalOwner;
import com.veterinarytrackingsystem.services.abstracts.AnimalOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/animalowners/")
public class AnimalOwnersController {

    @Autowired
    private AnimalOwnerService animalOwnerService;

    @GetMapping("getall")
    List<AnimalOwner>  getall(){
        return this.animalOwnerService.getAll();
    }
    @GetMapping("getbyid/{id}")
    AnimalOwner getById(@PathVariable Integer id){
        return this.animalOwnerService.getById(id);
    }

    @PostMapping("add")
    public AnimalOwner add(@RequestBody AnimalOwner animalOwner){
        return  this.animalOwnerService.add(animalOwner);
    }
    @PutMapping("update")
    public AnimalOwner update(@RequestBody  AnimalOwner animalOwner){
        return  this.animalOwnerService.update(animalOwner);
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable Integer id){
        return  this.animalOwnerService.delete(id);
    }
}


