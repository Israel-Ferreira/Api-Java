package br.com.codekaffee.vinhos.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * Produtor
 */
@Data
@Document
public class Produtor {
    @Id
    private String id;

    private String nome;

    private String pais;

    @DBRef
    private List<Vinho> vinhos;
}