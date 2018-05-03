package com.doganilbars;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.repositories.IProductRepository;

@SpringBootApplication
public class CreateentitymongodbApplication implements CommandLineRunner {

	@Autowired
	private IProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(CreateentitymongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		product.setName("Tivi 3");
		product.setPrice(123);
		product.setQuantity(4);
		product.setStatus(true);
		product.setDate(new Date());
		product = productRepository.save(product);
		System.out.println("Product Id Last Inserted: " + product.getId());

	}
}
