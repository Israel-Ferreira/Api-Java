package br.com.codekaffee.vinhos.controllers;

import java.util.List;

public interface ICrudController<T> {
    List<T> getAll();
    T getById(String id);
    void create(T obj);
    void update(String id, T obj);
    void delete(String id);
}
