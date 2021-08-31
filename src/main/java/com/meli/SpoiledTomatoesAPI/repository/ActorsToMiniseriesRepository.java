package com.meli.SpoiledTomatoesAPI.repository;

import com.meli.SpoiledTomatoesAPI.model.ActorToMiniserie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorsToMiniseriesRepository extends JpaRepository<ActorToMiniserie, Long> {
}
