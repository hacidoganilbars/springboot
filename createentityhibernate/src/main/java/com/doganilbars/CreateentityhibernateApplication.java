package com.doganilbars;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.services.IProductService;

@SpringBootApplication
public class CreateentityhibernateApplication implements CommandLineRunner {

	@Autowired
	private IProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(CreateentityhibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product product = new Product();
		product.setName("New Name b");
		product.setPrice(BigDecimal.valueOf(22));
		product.setQuantity(7);
		product.setDescription("perfect pro");
		product.setFeatured(true);
		product.setPhoto("b.gif");
		int newId = productService.create(product);
		System.out.println("New Id: " + newId);
	}
}
