package com.meli.SpoiledTomatoesAPI.service;

import com.meli.SpoiledTomatoesAPI.dto.request.ActorDTO;
import com.meli.SpoiledTomatoesAPI.model.ActorModel;
import com.meli.SpoiledTomatoesAPI.model.MovieModel;
import com.meli.SpoiledTomatoesAPI.repository.IActorsRepository;
import com.meli.SpoiledTomatoesAPI.repository.IMoviesRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ActorServiceImpl implements IActorService {

    private IActorsRepository repository;
    private IMoviesRepository moviesRepository;

    public ActorServiceImpl(IActorsRepository repository, IMoviesRepository moviesRepository){
        this.repository = repository;
        this.moviesRepository = moviesRepository;
    }

    @Override
    public ActorModel createActor(ActorDTO actorDTO) throws Exception {


       MovieModel favoriteMovieModel = this.moviesRepository.findById(actorDTO.getFavoriteMovieId())
                .orElseThrow(() -> new Exception("No existe esa movie"));
                ActorModel actorModel = ActorModel.builder()
                .firstName(actorDTO.getFirstName())
                .lastName(actorDTO.getLastName())
                .rating(actorDTO.getRating())
                .createdAt(new Date())
                .updatedAt(new Date())
                .favoriteMovie(favoriteMovieModel)
                .build();
        return this.repository.save(actorModel);

    }

    @Override
    public ActorDTO getActor(Long id) {
        return null;
    }

    @Override
    public List<ActorDTO> getAllActors() {
        return null;
    }

    @Override
    public ActorDTO updateActor(Long id, ActorDTO actorDTO) {
        return null;
    }

    @Override
    public boolean deleteActor(Long id) {
        return false;
    }

    @Override
    public String createActorToMovie(Long actorId, Long movieId) throws  Exception {

        ActorModel actorModel = this.repository.findById(actorId)
                .orElseThrow(()-> new Exception("No existe actor"));
        System.out.println("_____________");
        System.out.println(actorModel.getFirstName());
        System.out.println("_____________");

        MovieModel movieModel= this.moviesRepository.findById(movieId)
                .orElseThrow(()-> new Exception("Noexiste esa movie"));

        actorModel.addMovie(movieModel);
        this.repository.save(actorModel);
        return "Ok";
    }


    //Privates

    private ActorModel createActorModel(ActorDTO actorDTO){

        ActorModel newActor = ActorModel
                .builder()
                .firstName(actorDTO.getFirstName())
                .lastName(actorDTO.getLastName())
                .rating(actorDTO.getRating())
                .build();

        return newActor;
    }
}
