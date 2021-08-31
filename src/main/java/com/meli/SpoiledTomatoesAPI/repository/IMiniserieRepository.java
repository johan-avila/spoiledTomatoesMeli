package com.meli.SpoiledTomatoesAPI.repository;

import com.meli.SpoiledTomatoesAPI.model.MiniSerieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMiniserieRepository extends JpaRepository<MiniSerieModel, Long> {

}
