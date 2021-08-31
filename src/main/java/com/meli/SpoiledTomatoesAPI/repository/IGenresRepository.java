package com.meli.SpoiledTomatoesAPI.repository;

import com.meli.SpoiledTomatoesAPI.dto.request.GenreDTO;
import com.meli.SpoiledTomatoesAPI.model.GenreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGenresRepository extends JpaRepository<GenreModel, Long> {
   @Query("FROM GenreModel genres")
   List<GenreModel> findAll();
}
