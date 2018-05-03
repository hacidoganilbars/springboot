package com.doganilbars.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.doganilbars.entities.Product;

@Repository("productDAO")
public class ProductDAOImpl implements IProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Collection<Product> findAll() {
		return jdbcTemplate.query("select * from product", new BeanPropertyRowMapper<Product>(Product.class));
	}

}
