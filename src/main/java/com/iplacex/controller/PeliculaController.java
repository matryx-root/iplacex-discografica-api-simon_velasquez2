package com.iplacex.controller;

import com.iplacex.model.Pelicula;
import com.iplacex.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {
    @Autowired
    private PeliculaRepository peliculaRepository;

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        return peliculaRepository.findAll();
    }

    @PostMapping
    public Pelicula createPelicula(@RequestBody Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @DeleteMapping("/{id}")
    public void deletePelicula(@PathVariable String id) {
        peliculaRepository.deleteById(id);
    }
}
