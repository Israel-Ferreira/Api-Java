package br.com.codekaffee.vinhos.repository;

import org.springframework.data.repository.CrudRepository;

/**
 * AbstractRepository
 */
public interface AbstractRepository<T> extends CrudRepository<T,String> {
}