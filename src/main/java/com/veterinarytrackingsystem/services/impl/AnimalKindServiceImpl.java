package com.veterinarytrackingsystem.services.impl;

import com.veterinarytrackingsystem.models.AnimalKind;
import com.veterinarytrackingsystem.repositories.AnimalKindRepsitory;
import com.veterinarytrackingsystem.services.abstracts.AnimalKindService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimalKindServiceImpl implements AnimalKindService {
    @Autowired
    private  AnimalKindRepsitory animalKindRepsitory;




    @Override
    public List<AnimalKind> getAll() {
        return this.animalKindRepsitory.findAll();

    }

    @Override
    public AnimalKind getById(Integer id) {
      return this.animalKindRepsitory.findById(id).orElseThrow(()->new EntityNotFoundException());

    }
    @Override
    @Transactional
    public AnimalKind add(AnimalKind animalKind) {
        return this.animalKindRepsitory.save(animalKind);
    }

    @Override
    public AnimalKind update(AnimalKind animalKind) {
        
        return this.animalKindRepsitory.save(animalKind);
    }

    @Override
    public boolean delete(Integer id) {
        AnimalKind byId = animalKindRepsitory.findById(id).orElseThrow(()->new EntityNotFoundException());
        this.animalKindRepsitory.delete(byId);

        return true;
    }
}
