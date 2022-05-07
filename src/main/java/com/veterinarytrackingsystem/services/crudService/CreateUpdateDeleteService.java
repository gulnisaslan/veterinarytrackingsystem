package com.veterinarytrackingsystem.services.crudService;

public interface CreateUpdateDeleteService<T> {
    T add(T entity);

    T update(T entity);

    boolean delete(Integer id);
}
