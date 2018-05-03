package com.doganilbars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.repositories.IProductRepository;

@SpringBootApplication
public class UpdateentitymongodbApplication implements CommandLineRunner {

	@Autowired
	private IProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(UpdateentitymongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Update product with Id is 5aeb51579b7783dcbd67a17e");

		Product product = productRepository.findById("5aeb51579b7783dcbd67a17e").get();
		product.setName("Tivi 5");
		product.setPrice(392);
		product.setStatus(false);
		productRepository.save(product);
		System.out.println("Done!");

	}
}
