package com.meli.SpoiledTomatoesAPI.service;

import com.meli.SpoiledTomatoesAPI.dto.request.MiniserieDTO;
import com.meli.SpoiledTomatoesAPI.model.MiniSerieModel;
import com.meli.SpoiledTomatoesAPI.repository.IGenresRepository;
import com.meli.SpoiledTomatoesAPI.repository.IMiniserieRepository;
import org.springframework.stereotype.Service;

@Service
public class MiniseriesServiceImpl implements IMiniseriesService{

    private IMiniserieRepository miniserieRepository;
    private IGenresRepository genresRepository;

    public MiniseriesServiceImpl(
            IMiniserieRepository miniserieRepository,
            IGenresRepository genresRepository
    ) {
        this.miniserieRepository = miniserieRepository;
        this.genresRepository = genresRepository;
    }

    @Override
    public MiniSerieModel createMiniserie(MiniserieDTO miniserieDTO) {
        return null;
    }
}
