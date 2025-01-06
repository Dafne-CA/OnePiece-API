package com.proyecto.onepiece_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OnepieceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnepieceApiApplication.class, args);
	}

}
