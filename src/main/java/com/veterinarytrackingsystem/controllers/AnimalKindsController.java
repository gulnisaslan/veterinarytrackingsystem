package com.veterinarytrackingsystem.controllers;

import com.veterinarytrackingsystem.models.AnimalKind;
import com.veterinarytrackingsystem.services.abstracts.AnimalKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/animalkinds/")
public class AnimalKindsController {
    private final AnimalKindService animalKindService;

    public AnimalKindsController(AnimalKindService animalKindService) {
        this.animalKindService = animalKindService;
    }
    @GetMapping("getAll")
    public List<AnimalKind> getAll(){
        return this.animalKindService.getAll();
    }
    @GetMapping("getbyid")
    public AnimalKind getById(Integer id){
        return this.animalKindService.getById(id);

    }
    @PostMapping("add")
    public AnimalKind add(@RequestBody @Valid AnimalKind animalKind){
        return this.animalKindService.add(animalKind);

    }

    @PutMapping("update")
    public AnimalKind update(@RequestBody AnimalKind animalKind){
        return  this.animalKindService.update(animalKind);
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable Integer id){
       this.animalKindService.delete(id);
        return true;

    }
}