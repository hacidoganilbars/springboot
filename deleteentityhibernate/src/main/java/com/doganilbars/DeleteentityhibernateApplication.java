package com.doganilbars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doganilbars.entities.Product;
import com.doganilbars.service.IProductService;

@SpringBootApplication
public class DeleteentityhibernateApplication implements CommandLineRunner{

	@Autowired
	private IProductService productService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DeleteentityhibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("Delete product with Id is 10");
			Product product=productService.find(10);
			boolean result=productService.delete(product);
			System.out.println("Result: "+result);
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
}
