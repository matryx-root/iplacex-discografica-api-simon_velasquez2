package com.iplacex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "peliculas")
public class Pelicula {
    @Id
    private String id;
    private String titulo;
    private String genero;
    private int anioEstreno;
    private List<String> actores;

    // Getters and Setters
}
