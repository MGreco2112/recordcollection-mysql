package com.recordcollection.collection.controllers;

import com.recordcollection.collection.models.Album;
import com.recordcollection.collection.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumRepository repository;

    @GetMapping
    public @ResponseBody List<Album> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody Album addAlbum(@RequestBody Album newAlbum) {
        return repository.save(newAlbum);
    }

    @GetMapping("{id}")
    public @ResponseBody Album getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }



}
