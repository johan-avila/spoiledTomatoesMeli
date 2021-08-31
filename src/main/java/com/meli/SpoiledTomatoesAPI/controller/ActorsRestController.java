package com.meli.SpoiledTomatoesAPI.controller;

import com.meli.SpoiledTomatoesAPI.dto.request.ActorDTO;
import com.meli.SpoiledTomatoesAPI.model.ActorModel;
import com.meli.SpoiledTomatoesAPI.service.IActorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorsRestController {

    private IActorService actorService;

    public ActorsRestController(IActorService actorService) {
        this.actorService = actorService;
    }

    @PostMapping
    public ActorModel creteActor(@RequestBody ActorDTO actorDTO) throws Exception {

        return this.actorService.createActor(actorDTO);
    };

    @PostMapping("/actor-work-movie/{actorId}/{movieId}")
    public String createActorToMovie(@PathVariable Long actorId, @PathVariable Long movieId)  throws  Exception {

        System.out.println(actorId+"++++"+movieId);


        this.actorService.createActorToMovie(actorId,movieId);
        return actorId+"++++"+movieId;
    }

//    @GetMapping("/{actorId}")
//    public ActorDTO getActor(@PathVariable Long actorId){
//        return this.actorService.getActor(actorId);
//    };
//
//    @GetMapping("/all")
//    public List<ActorDTO> getAllActors(){
//        return this.actorService.getAllActors();
//    };
//
//    @PutMapping("/{actorId}")
//    public ActorDTO updateActor(@PathVariable Long actorId, @RequestBody ActorDTO actorDTO){
//        return this.actorService.updateActor(actorId, actorDTO);
//    };
//
//    @DeleteMapping("/{actorId}")
//    public boolean deleteActor(@PathVariable Long actorId){
//        return this.actorService.deleteActor(actorId);
//    };
}
