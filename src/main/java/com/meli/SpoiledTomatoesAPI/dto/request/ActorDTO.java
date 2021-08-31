package com.meli.SpoiledTomatoesAPI.dto.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActorDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Double rating;
    private Long favoriteMovieId;

}
