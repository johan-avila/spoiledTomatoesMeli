package com.meli.SpoiledTomatoesAPI.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "seasons")
public class SeasonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private int number;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "end_date")
    private Date endDate;

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
    //miniserie relation
    @ManyToOne
    @JoinColumn(
            name = "miniserie_id",
            nullable = false
    )
    private MiniSerieModel miniserie;

    //episodes relations
    @OneToMany(mappedBy = "season" )
    private Set<EpisodeModel> episodes;

}
