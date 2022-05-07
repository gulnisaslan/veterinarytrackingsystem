package com.veterinarytrackingsystem.repositories;

import com.veterinarytrackingsystem.models.AnimalKind;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalKindRepsitory extends JpaRepository<AnimalKind,Integer> {

    
}