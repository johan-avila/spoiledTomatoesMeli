package com.meli.SpoiledTomatoesAPI.service;

import com.meli.SpoiledTomatoesAPI.dto.request.ActorDTO;
import com.meli.SpoiledTomatoesAPI.dto.request.GenreDTO;
import com.meli.SpoiledTomatoesAPI.model.GenreModel;

import java.util.List;

public interface IGenresService {
    GenreModel createGenre(GenreDTO genreDTO);

    GenreDTO getGenre(Long id);

    List<GenreModel> getAllGenres();

    GenreDTO updateGenre(Long id,GenreDTO genreDTO);

    boolean deleteGenre(Long id) ;
}
