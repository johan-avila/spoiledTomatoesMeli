package com.meli.SpoiledTomatoesAPI.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "movies")
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
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
    @OneToMany(mappedBy = "favoriteMovie" )
    private Set<ActorModel> actor;


    //genres
    @ManyToOne
    @JoinColumn(
            name = "genre_id",
            nullable = false
    )
    private GenreModel genre;

    @ManyToMany(mappedBy = "movies" )
    private Set<ActorModel> actors;
}
