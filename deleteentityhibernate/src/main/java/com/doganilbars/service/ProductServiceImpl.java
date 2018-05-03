package com.doganilbars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doganilbars.dao.IProductDAO;
import com.doganilbars.entities.Product;

@Transactional
@Service("productService")
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDAO productDAO;

	@Override
	public Product find(int id) {
		return productDAO.find(id);
	}

	@Override
	public boolean delete(Product product) {
		return productDAO.delete(product);
	}

}
