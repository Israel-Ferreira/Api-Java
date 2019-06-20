package br.com.codekaffee.vinhos.services;

import java.util.List;

/**
 * ICrudService
 */


public interface ICrudService<T>  {
    List<T> getAll();
    T getById(String id);
    void create(T obj);
    void update(String id,T obj);
    void delete(String id);
}