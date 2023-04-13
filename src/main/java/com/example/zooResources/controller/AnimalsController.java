package com.example.zooResources.controller;

import com.example.zooResources.entity.Animals;
import com.example.zooResources.service.AnimalsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalsController {

    private final AnimalsService animalsService;

    public AnimalsController(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    @GetMapping("/allAnimals")
    public ResponseEntity<List<Animals>> getAllUser() {
        return ResponseEntity.ok().body(animalsService.findAll());
    }

    @GetMapping("getAnimals/{id}")
    public ResponseEntity<Animals> show(@PathVariable Long id) {
        Animals animals = animalsService.findById(id);
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }
}
