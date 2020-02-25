package com.brodniak.masterproject.controller;

import com.brodniak.masterproject.entity.Movie;
import com.brodniak.masterproject.exception.MovieNotFoundException;
import com.brodniak.masterproject.repository.MovieRepo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MovieEndpoint {

    @Autowired
    MovieRepo movieRepo;

    @GetMapping(path = "/movieById")
    public Movie findById(@RequestParam String id) {
        return movieRepo.findByImdbId(id).orElseThrow(() -> new MovieNotFoundException(id));
    }

    @GetMapping(path = "/getTenPerPage")
    public List<Movie> getTen(@RequestParam int page) {
        if (page > 0) {
            page -= 1;
            return movieRepo.findMovies(PageRequest.of(page, 10));
        }
        return movieRepo.findMovies(PageRequest.of(0, 10));

    }

    @GetMapping(path = "/getMoviesPerPage/{page}/{size}")
    public List<Movie> getTwenty(@PathVariable int page, @PathVariable int size){
        if (page > 0 ){
            page -= 1;
            return movieRepo.findMovies(PageRequest.of(page, size));
        }
        return movieRepo.findMovies(PageRequest.of(0,size));
    }


}
