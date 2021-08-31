package com.meli.SpoiledTomatoesAPI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ActorToMiniserieId extends Serializable {
    @Column(name = "actor_id")
    Long actorId;

    @Column(name = "miniserie_id")
    Long miniserieId;
}
