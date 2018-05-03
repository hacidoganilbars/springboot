package com.doganilbars.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.doganilbars.entities.Product;

@Repository("productDAO")
public class ProductDAOImpl implements IProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean create(Product product) {
		return jdbcTemplate.update(
				"INSERT INTO product(name,price,quantity,description,photo,featured) VALUES (?,?,?,?,?,?)",
				product.getName(), product.getPrice(), product.getQuantity(), product.getDescription(),
				product.getPhoto(), product.isFeatured()) > 0;
	}

}
