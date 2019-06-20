package br.com.codekaffee.vinhos.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


/**
 * Vinho
*/
@Data
@Document
public class Vinho {
    @Id
    private String id;

    private String nomeVinho;

    private int safra;
}

