package com.meli.SpoiledTomatoesAPI.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "miniseries")
public class MiniSerieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Double rating;
    private Integer awards;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    //relationships
    //actors
    @OneToMany(mappedBy = "miniserie_id")
    private Set<ActorToMiniserie> actorToMiniseries ;

    //genres
    @ManyToOne
    @JoinColumn(
            name = "genre_id",
            nullable = false
    )
    private GenreModel genre;

    //seasons
    @OneToMany(mappedBy = "miniserie")
    private Set<SeasonModel> seasons;



}
