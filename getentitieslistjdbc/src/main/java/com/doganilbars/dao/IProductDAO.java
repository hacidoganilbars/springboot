package com.doganilbars.dao;

import java.util.Collection;

import com.doganilbars.entities.Product;

public interface IProductDAO {

	public Collection<Product> findAll();
}
