package com.meli.SpoiledTomatoesAPI.service;

import com.meli.SpoiledTomatoesAPI.dto.request.GenreDTO;
import com.meli.SpoiledTomatoesAPI.model.GenreModel;
import com.meli.SpoiledTomatoesAPI.repository.IGenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GenresServiceImpl implements IGenresService{

    @Autowired
    private IGenresRepository genresRepository;

    @Override
    public GenreModel createGenre(GenreDTO genreDTO) {
        GenreModel genreModel = createGenreModel(genreDTO);
        genreModel.setCreatedAt(new Date());
        genreModel.setUpdatedAt(new Date());

        return this.genresRepository.save(genreModel);

    }

    @Override
    public GenreDTO getGenre(Long id) {
        return null;
    }

    @Override
    public List<GenreModel> getAllGenres() {
        return this.genresRepository.findAll();

    }

    @Override
    public GenreDTO updateGenre(Long id, GenreDTO genreDTO) {
        return null;
    }

    @Override
    public boolean deleteGenre(Long id) {
        return false;
    }

    //Privates
    private GenreModel createGenreModel(GenreDTO genreDTO){
        GenreModel newGenreModel = GenreModel.builder()
                .name(genreDTO.getName())
                .ranking(genreDTO.getRanking())
                .active(genreDTO.isActive())
                .build();

        return newGenreModel;
    }
}
