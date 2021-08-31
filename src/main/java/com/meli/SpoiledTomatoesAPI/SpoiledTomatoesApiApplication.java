package com.meli.SpoiledTomatoesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SpoiledTomatoesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpoiledTomatoesApiApplication.class, args);
	}

}
