package com.usa.mintic.ciclo4.reto4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

public class Reto4Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto4Application.class, args);
	}

}
