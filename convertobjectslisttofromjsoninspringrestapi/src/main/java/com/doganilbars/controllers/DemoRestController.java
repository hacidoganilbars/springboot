package com.doganilbars.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.doganilbars.entities.Product;

@RestController
@RequestMapping("/api/demo")
public class DemoRestController {

	@RequestMapping(value = "find", method = RequestMethod.GET, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE }, headers = "Accept=application/json")
	public ResponseEntity<List<Product>> find() {
		try {
			List<Product> products = new ArrayList<Product>();
			products.add(new Product("p01", "çikolata", 1.75));
			products.add(new Product("p02", "gofret", 1.5));
			products.add(new Product("p02", "sakız", 0.25));
			products.add(new Product("p03", "Bisküvi", 2));
			products.add(new Product("p04", "Kek", 0.5));
			return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Product>>(HttpStatus.BAD_REQUEST);
		}
	}

}
