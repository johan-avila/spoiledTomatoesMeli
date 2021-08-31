package com.meli.SpoiledTomatoesAPI.dto.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieDTO {
    private String title;
    private Double rating;
    private Integer awards;
    private Long genreId;
}
