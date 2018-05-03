package com.doganilbars;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.repositories.IProductRepository;

@SpringBootApplication
public class FindentitybyprimarykeymongodbApplication implements CommandLineRunner {

	@Autowired
	IProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(FindentitybyprimarykeymongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Product product = productRepository.findById("5aeb51129b7783dcbd67a17d").get();
		System.out.println("=============================================");
		System.out.println("Id: " + product.getId());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
		System.out.println("Quantity: " + product.getQuantity());
		System.out.println("Date: " + formatter.format(product.getDate()));
		System.out.println("Status: " + product.isStatus());
		System.out.println("=============================================");

	}
}
