package com.meli.SpoiledTomatoesAPI.service;

import com.meli.SpoiledTomatoesAPI.dto.request.MovieDTO;
import com.meli.SpoiledTomatoesAPI.model.MovieModel;

import java.util.List;

public interface IMoviesService {
    MovieModel createMovie(MovieDTO movieDTO) throws Exception;

    List<MovieModel> getAllMovies();
}
