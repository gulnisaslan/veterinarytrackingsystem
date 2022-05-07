package com.veterinarytrackingsystem.services.abstracts;



import com.veterinarytrackingsystem.models.Animal;
import com.veterinarytrackingsystem.services.crudService.CreateUpdateDeleteService;
import com.veterinarytrackingsystem.services.crudService.ReadService;

import java.util.List;

public interface AnimalService extends ReadService<Animal>, CreateUpdateDeleteService<Animal> {

    List<Animal> findByAnimalOwner_FirstName(String firstname);

    List<Animal> findByName(String name);
}
