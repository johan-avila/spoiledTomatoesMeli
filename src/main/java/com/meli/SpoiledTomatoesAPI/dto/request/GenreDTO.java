package com.meli.SpoiledTomatoesAPI.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GenreDTO {
    private String name;
    private int ranking;
    private boolean active;
}
