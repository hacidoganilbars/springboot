package com.doganilbars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.dao.IProductDAO;
import com.doganilbars.entities.Product;

@SpringBootApplication
public class GetentitieslistjdbcApplication implements CommandLineRunner {

	@Autowired
	private IProductDAO productDAO;

	public static void main(String[] args) {
		SpringApplication.run(GetentitieslistjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (Product product : productDAO.findAll()) {

			System.out.println("Id: " + product.getId());
			System.out.println("Name: " + product.getName());
			System.out.println("Price: " + product.getPrice());
			System.out.println("Quantity: " + product.getQuantity());
			System.out.println("Description: " + product.getDescription());
			System.out.println("Photo: " + product.getPhoto());
			System.out.println("Featured: " + product.isFeatured());
			System.out.println("========================================");

		}

	}
}
