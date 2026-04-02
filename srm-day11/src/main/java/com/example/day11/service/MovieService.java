package com.example.day11.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day11.model.Movie;
import com.example.day11.repository.MovieRepository;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getMovies(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by("title").descending());
        return repository.findAll(pageRequest).getContent();
    }

}
