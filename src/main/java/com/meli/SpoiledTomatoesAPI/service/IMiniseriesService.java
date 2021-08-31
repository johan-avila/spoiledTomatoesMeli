package com.meli.SpoiledTomatoesAPI.service;

import com.meli.SpoiledTomatoesAPI.dto.request.MiniserieDTO;
import com.meli.SpoiledTomatoesAPI.model.MiniSerieModel;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

public interface IMiniseriesService {
    public MiniSerieModel createMiniserie(MiniserieDTO miniserieDTO);
}
