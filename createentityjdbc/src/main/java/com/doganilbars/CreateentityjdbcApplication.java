package com.doganilbars;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.dao.IProductDAO;
import com.doganilbars.entities.Product;

@SpringBootApplication
public class CreateentityjdbcApplication implements CommandLineRunner {

	@Autowired
	private IProductDAO productDAO;

	public static void main(String[] args) {
		SpringApplication.run(CreateentityjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		product.setName("Television");
		product.setPrice(BigDecimal.valueOf(11));
		product.setQuantity(2);
		product.setDescription("good life");
		product.setFeatured(true);
		product.setPhoto("tv.gif");
		boolean result = productDAO.create(product);
		System.out.println("Result: " + result);

	}
}
