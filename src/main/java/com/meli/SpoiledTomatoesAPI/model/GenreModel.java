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
@Table(name = "genres")
public class GenreModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private int ranking;
    private boolean active;

    //createdAt and updatedAt
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;


    //relationships
    //Miniserie one to one
    @OneToMany(mappedBy = "genre")
    private Set<MiniSerieModel> miniseries;

    @OneToMany(mappedBy = "genre")
    private Set<MovieModel> movies;
    //movie one to onme


}
