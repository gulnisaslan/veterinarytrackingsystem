package com.veterinarytrackingsystem.repositories;

import com.veterinarytrackingsystem.models.Animal;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Animal
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer>{

    List<Animal> findByAnimalOwner_FirstName(String firstname);

   List<Animal> findByName(String name);


}