package com.veterinarytrackingsystem.services.abstracts;

import com.veterinarytrackingsystem.models.AnimalOwner;
import com.veterinarytrackingsystem.services.crudService.CreateUpdateDeleteService;
import com.veterinarytrackingsystem.services.crudService.ReadService;

import java.util.List;

public interface AnimalOwnerService extends ReadService<AnimalOwner>, CreateUpdateDeleteService<AnimalOwner> {


}
