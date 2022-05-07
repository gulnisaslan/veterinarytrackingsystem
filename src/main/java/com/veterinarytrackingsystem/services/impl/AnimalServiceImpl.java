package com.veterinarytrackingsystem.services.impl;


import com.veterinarytrackingsystem.models.Animal;
import com.veterinarytrackingsystem.models.AnimalOwner;
import com.veterinarytrackingsystem.repositories.AnimalRepository;
import com.veterinarytrackingsystem.services.abstracts.AnimalOwnerService;
import com.veterinarytrackingsystem.services.abstracts.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;


@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private AnimalOwnerService animalOwnerService;


    @Override
    @Transactional
    public Animal add(Animal entity) {

        return this.animalRepository.save(entity);
    }

    @Override
    public Animal update(Animal entity) {
        return this.animalRepository.save(entity);
    }

    @Override
    public boolean delete(Integer id) {
        Animal byId = this.animalRepository.findById(id).orElseThrow(()->new EntityNotFoundException());
        this.animalRepository.delete(byId);

        return true;
    }

    @Override
    public List<Animal> getAll() {
        return this.animalRepository.findAll();
    }

    @Override
    public Animal getById(Integer id) {
        return this.animalRepository.getById(id);
    }

    @Override
    public List<Animal> findByAnimalOwner_FirstName(String firstname) {
        return this.animalRepository.findByAnimalOwner_FirstName(firstname);
    }

    @Override
    public List<Animal> findByName(String name) {
        return this.animalRepository.findByName(name);
    }



}
