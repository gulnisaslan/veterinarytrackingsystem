package com.veterinarytrackingsystem.services.impl;

import com.veterinarytrackingsystem.models.AnimalGender;
import com.veterinarytrackingsystem.repositories.AnimalGenderRepository;
import com.veterinarytrackingsystem.services.abstracts.AnimalGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalGenderServiceImpl implements AnimalGenderService {
   @Autowired
    private AnimalGenderRepository animalGenderRepository;



    @Override
    @Transactional
    public AnimalGender add(AnimalGender entity) {
        return this.animalGenderRepository.save(entity);
    }

    @Override
    public AnimalGender update(AnimalGender entity) {
        return this.animalGenderRepository.save(entity);
    }

    @Override
    public boolean delete(Integer id) {
        AnimalGender byId = this.animalGenderRepository.findById(id).orElseThrow(()->new EntityNotFoundException());
        animalGenderRepository.delete(byId);
        return true;
    }

    @Override
    public List<AnimalGender> getAll() {
        return this.animalGenderRepository.findAll();
    }

    @Override
    public AnimalGender getById(Integer id) {
     return   this.animalGenderRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());

    }
}
