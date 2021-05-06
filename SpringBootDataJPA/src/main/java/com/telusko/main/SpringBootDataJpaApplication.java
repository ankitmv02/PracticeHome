package com.telusko.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		System.out.println("Home Student Data JPA program");
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}

}
