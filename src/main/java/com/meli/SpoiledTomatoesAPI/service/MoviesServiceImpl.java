package com.meli.SpoiledTomatoesAPI.service;

import com.meli.SpoiledTomatoesAPI.dto.request.MovieDTO;
import com.meli.SpoiledTomatoesAPI.model.GenreModel;
import com.meli.SpoiledTomatoesAPI.model.MovieModel;
import com.meli.SpoiledTomatoesAPI.repository.IGenresRepository;
import com.meli.SpoiledTomatoesAPI.repository.IMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MoviesServiceImpl implements IMoviesService {

    private IMoviesRepository moviesRepository;
    private IGenresRepository genresRepository;

    @Autowired
    public MoviesServiceImpl(IMoviesRepository moviesRepository,
                             IGenresRepository genresRepository){
        this.moviesRepository = moviesRepository;
        this.genresRepository = genresRepository;
    }

    @Override
    public MovieModel createMovie(MovieDTO movieDTO) throws Exception {
        GenreModel auxGenre = this.genresRepository.findById(movieDTO.getGenreId())
                .orElseThrow(() -> new Exception("No existe la nota"));

        MovieModel newMovieModel = MovieModel.builder()
                .title(movieDTO.getTitle())
                .rating(movieDTO.getRating())
                .awards(movieDTO.getAwards())
                .genre(auxGenre)
                .createdAt(new Date())
                .updatedAt(new Date())
                .build();

        Long movieId = moviesRepository.save(newMovieModel).getId();
        return this.moviesRepository.findById(movieId)
                .orElseThrow(() -> new Exception("No existe la movie"));
    }

    @Override
    public List<MovieModel> getAllMovies() {
        return this.moviesRepository.findAll();
    }


}
