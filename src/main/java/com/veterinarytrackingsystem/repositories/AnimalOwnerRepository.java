package com.veterinarytrackingsystem.repositories;

import com.veterinarytrackingsystem.models.AnimalOwner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnimalOwnerRepository extends JpaRepository<AnimalOwner,Integer>{


}