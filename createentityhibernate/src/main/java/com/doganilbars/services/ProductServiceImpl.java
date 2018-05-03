package com.doganilbars.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doganilbars.dao.IProductDAO;
import com.doganilbars.entities.Product;

@Transactional
@Service("productService")
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDAO productDAO;

	@Override
	public Integer create(Product product) {
		return productDAO.create(product);
	}

}
