package com.doganilbars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.dao.IProductDAO;

@SpringBootApplication
public class DeleteentityjdbcApplication implements CommandLineRunner {

	@Autowired
	private IProductDAO productDAO;

	public static void main(String[] args) {
		SpringApplication.run(DeleteentityjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Delete product where id is 6");
		boolean result = productDAO.delete(6);
		System.out.println("Result: " + result);

	}
}
