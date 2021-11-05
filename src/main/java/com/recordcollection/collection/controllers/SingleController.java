package com.recordcollection.collection.controllers;

import com.recordcollection.collection.models.Single;
import com.recordcollection.collection.repositories.SingleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/singles")
public class SingleController {
    @Autowired
    private SingleRepository repository;

    @GetMapping
    public @ResponseBody List<Single> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody Single postOne(@RequestBody Single newSingle) {
        return repository.save(newSingle);
    }

    @GetMapping("/{id}")
    public @ResponseBody Single getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    //TODO add the Modify and Delete routes from App Project

}
