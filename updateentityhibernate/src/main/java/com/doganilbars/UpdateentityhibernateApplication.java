package com.doganilbars;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.service.IProductService;

@SpringBootApplication
public class UpdateentityhibernateApplication implements CommandLineRunner {

	@Autowired
	IProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(UpdateentityhibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Update Product with id is 11");
		Product product = productService.find(11);
		product.setName("notebook");
		product.setPrice(BigDecimal.valueOf(11));
		product.setFeatured(true);
		boolean result = productService.update(product);
		System.out.println("Result: " + result);

	}
}
