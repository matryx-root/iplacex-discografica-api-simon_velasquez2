package com.iplacex.repository;

import com.iplacex.model.Pelicula;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeliculaRepository extends MongoRepository<Pelicula, String> {
}
