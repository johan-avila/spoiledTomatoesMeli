package com.meli.SpoiledTomatoesAPI.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table
public class EpisodeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;
    private int number;

    private Date releaseDate;

    private Double rating;

    //cretedAt and updatedAt
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    //relationships
    //season
    @ManyToOne
    @JoinColumn(
            name = "season_id",
            nullable = false
    )
    private SeasonModel season;

}
