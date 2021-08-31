package com.meli.SpoiledTomatoesAPI.controller;

import com.meli.SpoiledTomatoesAPI.dto.request.MovieDTO;
import com.meli.SpoiledTomatoesAPI.model.MovieModel;
import com.meli.SpoiledTomatoesAPI.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MoviesRestController {

    @Autowired
    private IMoviesService moviesService;

    @PostMapping
        public MovieModel createMovie(@RequestBody MovieDTO movieDTO) throws Exception {
        return this.moviesService.createMovie(movieDTO);
    }

    @GetMapping
    public List<MovieModel> getAllMovies(){
        return this.moviesService.getAllMovies();
    }
}
