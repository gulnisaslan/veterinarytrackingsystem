package com.veterinarytrackingsystem.services.crudService;

import java.util.List;

public interface ReadService<T> {
    List<T> getAll();
    T getById(Integer id);
}

