package com.recordcollection.collection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Single {
    private @Id @GeneratedValue Long id;
    private String name;
    private String releaseYear;

    public Single(String name, String releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Single() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}
