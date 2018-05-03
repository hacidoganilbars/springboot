package com.doganilbars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.properties.IProductRepository;

@SpringBootApplication
public class DeleteentityApplication implements CommandLineRunner {

	@Autowired
	private IProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DeleteentityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("Delete product with Id is 9");
			productRepository.deleteById(9);
			System.out.println("Done");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
