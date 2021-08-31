package com.meli.SpoiledTomatoesAPI.model;

import jdk.jfr.Timespan;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actors_to_moniseries")
public class ActorToMiniserie {

    @EmbeddedId
    private ActorToMiniserieId id = new ActorToMiniserieId();

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt = new Date();


    //Relationships
    @ManyToOne
    @JoinColumn(
            name = "miniserie_id",
            nullable = false
    )
    private MiniSerieModel miniSerie;

    @ManyToOne
    @JoinColumn(
            name = "actor_id",
            nullable = false
    )
    private ActorModel actor;

    @Deprecated
    public ActorToMiniserie(MiniSerieModel miniSerie, ActorModel actor) {
        this.setMiniSerie(miniSerie);
        this.actor = actor;
    }
}
