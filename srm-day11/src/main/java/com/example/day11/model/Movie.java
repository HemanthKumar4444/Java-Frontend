package com.example.day11.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@NoArgsConstructor
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int publishedYear;
    private String posterUrl;
    private String description;

    public Movie(String title, int publishedYear, String posterUrl, String description) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.posterUrl = posterUrl;
        this.description = description;
    }

}
