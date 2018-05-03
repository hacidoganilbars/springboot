package com.doganilbars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doganilbars.dao.IProductDAO;
import com.doganilbars.entities.Product;

@org.springframework.transaction.annotation.Transactional
@Service("productService")
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDAO productDAO;

	@Override
	public Product find(int id) {
		return productDAO.find(id);
	}

	@Override
	public boolean update(Product product) {
		return productDAO.update(product);
	}

}
