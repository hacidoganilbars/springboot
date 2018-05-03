package com.doganilbars;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.repositories.IProductRepository;

@SpringBootApplication
public class UpdateentityApplication implements CommandLineRunner {

	@Autowired
	private IProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(UpdateentityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Update product with Id is 9");
		Product product = productRepository.findById(9).get();
		product.setName("New Name 1");
		product.setPrice(BigDecimal.valueOf(11));
		product.setFeatured(true);
		productRepository.save(product);
		System.out.println("Done");

	}
}
