package com.recordcollection.collection.models;

import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Album {
    private @Id @GeneratedValue Long id;
    private String name;
    private Integer numberOfTracks;
    private String releaseYear;

    public Album(String name, Integer numberOfTracks, String releaseYear) {
       this.name = name;
       this.numberOfTracks = numberOfTracks;
       this.releaseYear = releaseYear;
    }

    public Album() {

    }


    public void setId(Long id) {
       this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public Integer getNumberOfTracks() {
       return numberOfTracks;
    }

    public void setNumberOfTracks(Integer numberOfTracks) {
       this.numberOfTracks = numberOfTracks;
    }

    public String getReleaseYear() {
       return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
       this.releaseYear = releaseYear;
    }


}
