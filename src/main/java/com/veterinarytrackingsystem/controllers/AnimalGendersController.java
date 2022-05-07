package com.veterinarytrackingsystem.controllers;

import com.veterinarytrackingsystem.models.AnimalGender;

import com.veterinarytrackingsystem.models.AnimalOwner;
import com.veterinarytrackingsystem.services.abstracts.AnimalGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("v1/animalgender/")
public class AnimalGendersController {

    @Autowired
    private AnimalGenderService animalGenderService;
    @GetMapping("getAll")
    public List<AnimalGender> getAll(){
        return this.animalGenderService.getAll();
    }

    @GetMapping("getbyid/{id}")
    public AnimalGender getById(@PathVariable Integer id){
        return this.animalGenderService.getById(id);

    }
    @PostMapping("add")
    public AnimalGender add(@RequestBody @Valid AnimalGender animalGender){
        return this.animalGenderService.add(animalGender);

    }

    @PutMapping("update")
    public AnimalGender update(@RequestBody  AnimalGender animalGender){
        return  this.animalGenderService.update(animalGender);
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable Integer id){
        this.animalGenderService.delete(id);
        return true;

    }







}
