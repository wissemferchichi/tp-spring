package com.tp.foyer.tp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TpSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpSpringApplication.class, args);
	}

}
