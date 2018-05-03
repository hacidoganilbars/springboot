package com.doganilbars.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("productDAO")
public class ProductDAOImpl implements IProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean delete(int id) {

		return jdbcTemplate.update("delete from product where id=?", id) > 0;
	}

}
