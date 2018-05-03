package com.doganilbars.service;

import com.doganilbars.entities.Product;

public interface IProductService {

	public Product find(int id);

	public boolean delete(Product product);

}
