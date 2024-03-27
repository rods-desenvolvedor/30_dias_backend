package com.rods.dia_02;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "open-api", version = "1", description = "API desenvolvida para um desafio de 30 dias"))
public class Dia02Application {

	public static void main(String[] args) {
		SpringApplication.run(Dia02Application.class, args);
	}

}
