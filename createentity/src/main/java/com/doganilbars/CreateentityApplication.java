package com.doganilbars;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.repositories.IProductRepository;

@SpringBootApplication
public class CreateentityApplication implements CommandLineRunner {

	@Autowired
	private IProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(CreateentityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		product.setName("New Name 2");
		product.setPrice(BigDecimal.valueOf(11));
		product.setQuantity(2);
		product.setDescription("good");
		product.setFeatured(false);
		product.setPhoto("b.gif");
		product = productRepository.save(product);
		System.out.println("New Id: " + product.getId());

	}
}
