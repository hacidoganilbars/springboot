package com.doganilbars;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.dao.IProductDAO;
import com.doganilbars.entities.Product;

@SpringBootApplication
public class UpdateentityjdbcApplication implements CommandLineRunner {

	@Autowired
	private IProductDAO productDAO;

	public static void main(String[] args) {
		SpringApplication.run(UpdateentityjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Update product with Id is 12");
		Product product = new Product();
		product.setId(12);
		product.setName("Television x");
		product.setPrice(BigDecimal.valueOf(222));
		product.setQuantity(33);
		product.setDescription("Television x description");
		product.setPhoto("tvx.gif");
		product.setFeatured(true);
		boolean result = productDAO.update(product);
		System.out.println("Result: " + result);

	}
}
