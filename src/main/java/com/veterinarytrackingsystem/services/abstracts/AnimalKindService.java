package com.veterinarytrackingsystem.services.abstracts;


import com.veterinarytrackingsystem.models.AnimalKind;
import com.veterinarytrackingsystem.services.crudService.CreateUpdateDeleteService;
import com.veterinarytrackingsystem.services.crudService.ReadService;

import java.util.List;
import java.util.Optional;

public interface AnimalKindService extends ReadService<AnimalKind>, CreateUpdateDeleteService<AnimalKind> {


}
