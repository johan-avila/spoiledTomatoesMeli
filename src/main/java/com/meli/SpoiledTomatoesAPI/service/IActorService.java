package com.meli.SpoiledTomatoesAPI.service;

import com.meli.SpoiledTomatoesAPI.dto.request.ActorDTO;
import com.meli.SpoiledTomatoesAPI.model.ActorModel;

import java.util.List;

public interface IActorService {
    ActorModel createActor(ActorDTO actorDTO) throws Exception ;

    ActorDTO getActor(Long id);

    List<ActorDTO> getAllActors();

    ActorDTO updateActor(Long id, ActorDTO actorDTO);

    boolean deleteActor(Long id) ;

    //
    String createActorToMovie(Long actorId, Long movieId)  throws  Exception;

}
