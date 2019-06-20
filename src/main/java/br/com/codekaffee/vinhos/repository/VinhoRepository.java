package br.com.codekaffee.vinhos.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;

import br.com.codekaffee.vinhos.models.Vinho;

/**
 * VinhoRepository
 * 
 * @param <inho>
 */
public interface VinhoRepository extends AbstractRepository<Vinho> {
    @Query("{}")
    List<Vinho> findAllVinhos();
}