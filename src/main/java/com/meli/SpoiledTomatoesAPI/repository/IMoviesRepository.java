package com.meli.SpoiledTomatoesAPI.repository;

import com.meli.SpoiledTomatoesAPI.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMoviesRepository extends JpaRepository<MovieModel, Long> {
    @Override
    @Query("FROM MovieModel movie "+
    "where movie.id = :aLong")
    Optional<MovieModel> findById(Long aLong);
}
