package com.veterinarytrackingsystem.services.abstracts;

import com.veterinarytrackingsystem.models.AnimalGender;
import com.veterinarytrackingsystem.services.crudService.CreateUpdateDeleteService;
import com.veterinarytrackingsystem.services.crudService.ReadService;

public interface AnimalGenderService extends ReadService<AnimalGender> , CreateUpdateDeleteService<AnimalGender> {
}
