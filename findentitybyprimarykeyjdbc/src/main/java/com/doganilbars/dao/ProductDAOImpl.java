package com.doganilbars.dao;

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
	public Product find(int id) {
		return jdbcTemplate.queryForObject("select * from product where id = ?",
				new BeanPropertyRowMapper<Product>(Product.class), id);
	}

}
