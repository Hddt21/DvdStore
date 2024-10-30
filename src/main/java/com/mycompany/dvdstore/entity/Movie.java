package com.mycompany.dvdstore.entity;

import java.util.ArrayList;
import java.util.List;

public class Movie {
     String title;
     String genre;
     Long id;
     String description;

    public Movie() {
        this.title = title;
        this.genre = genre;
        this.id = id;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
