package com.iplacex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "actores")
public class Actor {
    @Id
    private String id;
    private String nombre;
    private int edad;
    private List<String> peliculas;
    private boolean estaRetirado;

    // Getters and Setters
}
