package com.meli.SpoiledTomatoesAPI.repository;

import com.meli.SpoiledTomatoesAPI.model.ActorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActorsRepository extends JpaRepository<ActorModel, Long> {

}
