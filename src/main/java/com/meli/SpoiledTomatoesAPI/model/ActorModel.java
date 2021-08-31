package com.meli.SpoiledTomatoesAPI.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "actors")
public class ActorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Double rating;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    //relationships
    @ManyToOne()
    @JoinColumn(
            name = "favorite_movie_id",
            referencedColumnName = "id")
    private MovieModel favoriteMovie;

    // many to many relationships
    @ManyToMany
    @JoinTable(
            name = "actor_movie",
            joinColumns = @JoinColumn(name= "actor_id"),
            inverseJoinColumns =  @JoinColumn(name= "movie_id")
    )
    private Set<MovieModel> movies;
    // add actorToMovie

    public void addMovie(MovieModel movieModel){
        this.movies.add(movieModel);
        movieModel.getActor().add(this);
    }


    @OneToMany(mappedBy = "actor_id")
    private Set<ActorToMiniserie> actorToMiniseries;


}
