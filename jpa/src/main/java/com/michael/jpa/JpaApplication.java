package com.michael.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.michael.domain.Product;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
		
		Product produto = new Product();
		produto.setPrice(2.0);
		produto.setName("Joao");
	
	}

}
