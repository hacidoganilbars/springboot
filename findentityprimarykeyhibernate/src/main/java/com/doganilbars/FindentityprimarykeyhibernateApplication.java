package com.doganilbars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.services.IProductService;

@SpringBootApplication
public class FindentityprimarykeyhibernateApplication implements CommandLineRunner {

	@Autowired
	private IProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(FindentityprimarykeyhibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = productService.find(7);
		System.out.println("============================================");
		System.out.println("Id: " + product.getId());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
		System.out.println("Quantity: " + product.getQuantity());
		System.out.println("Description: " + product.getDescription());
		System.out.println("Photo: " + product.getPhoto());
		System.out.println("Featured: " + product.isFeatured());
		System.out.println("============================================");

	}
}
