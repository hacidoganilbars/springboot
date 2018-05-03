package com.doganilbars.dao;

import java.util.List;

import com.doganilbars.entities.Product;

public interface IProductDAO {

	public List<Product> findAll();

}
