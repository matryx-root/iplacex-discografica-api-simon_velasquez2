package com.iplacex.controller;

import com.iplacex.model.Actor;
import com.iplacex.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actores")
public class ActorController {
    @Autowired
    private ActorRepository actorRepository;

    @GetMapping
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorRepository.save(actor);
    }

    @DeleteMapping("/{id}")
    public void deleteActor(@PathVariable String id) {
        actorRepository.deleteById(id);
    }
}
