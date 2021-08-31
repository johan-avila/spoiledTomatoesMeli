package com.meli.SpoiledTomatoesAPI.controller;

import com.meli.SpoiledTomatoesAPI.dto.request.MiniserieDTO;
import com.meli.SpoiledTomatoesAPI.model.MiniSerieModel;
import com.meli.SpoiledTomatoesAPI.service.IMiniseriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/miniseries")
public class MiniseriesRestController {
    @Autowired
    IMiniseriesService miniseriesService;

    @PostMapping
    public MiniSerieModel createMiniserie(
            @RequestBody MiniserieDTO miniserieDTO){
        return this.miniseriesService.createMiniserie(miniserieDTO);
    }
}
