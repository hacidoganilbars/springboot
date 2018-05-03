package com.doganilbars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.repositories.IProductRepository;

@SpringBootApplication
public class DeleteentitymongodbApplication implements CommandLineRunner{

	@Autowired
	private IProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DeleteentitymongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Delete Product with id is  5aeb51579b7783dcbd67a17e");
		productRepository.deleteById("5aeb51579b7783dcbd67a17e");
		System.out.println("Done!");
		
	}
}
