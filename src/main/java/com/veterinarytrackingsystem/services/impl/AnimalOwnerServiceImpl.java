package com.veterinarytrackingsystem.services.impl;

import com.veterinarytrackingsystem.models.AnimalOwner;
import com.veterinarytrackingsystem.repositories.AnimalOwnerRepository;
import com.veterinarytrackingsystem.services.abstracts.AnimalOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalOwnerServiceImpl implements AnimalOwnerService {

    @Autowired
    private AnimalOwnerRepository animalOwnerRepository;




    @Override
    @Transactional
    public AnimalOwner add(AnimalOwner entity) {
        return this.animalOwnerRepository.save(entity);
    }

    @Override
    public AnimalOwner update(AnimalOwner entity) {
        return this.animalOwnerRepository.save(entity);
    }

    @Override
    public boolean delete(Integer id) {
        AnimalOwner byId = this.animalOwnerRepository.findById(id).orElseThrow(()->new EntityNotFoundException());
        this.animalOwnerRepository.delete(byId);
        return false;
    }


    @Override
    public List<AnimalOwner> getAll() {
        return this.animalOwnerRepository.findAll();
    }

    @Override

    public AnimalOwner getById(Integer id) {

        return this.animalOwnerRepository.findById(id).orElseThrow(()->new EntityNotFoundException());
    }
}