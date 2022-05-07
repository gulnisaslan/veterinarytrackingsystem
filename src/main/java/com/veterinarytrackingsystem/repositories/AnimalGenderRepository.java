package com.veterinarytrackingsystem.repositories;

import com.veterinarytrackingsystem.models.AnimalGender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalGenderRepository extends JpaRepository<AnimalGender,Integer> {
}
