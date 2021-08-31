package com.meli.SpoiledTomatoesAPI.controller;

import com.meli.SpoiledTomatoesAPI.dto.request.GenreDTO;
import com.meli.SpoiledTomatoesAPI.model.GenreModel;
import com.meli.SpoiledTomatoesAPI.repository.IGenresRepository;
import com.meli.SpoiledTomatoesAPI.service.IGenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenresRestController {

    @Autowired
    private IGenresService genresService;

    @PostMapping
    public GenreModel createGenre(@RequestBody  GenreDTO genreDTO){
        return this.genresService.createGenre(genreDTO);
    }

    @GetMapping("/all")
    public List<GenreModel> getAllGenres(){
        return this.genresService.getAllGenres();
    }


}
