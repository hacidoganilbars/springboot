package com.doganilbars.services;

import java.util.List;

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
	public List<Product> findAll() {
		return productDAO.findAll();
	}

}
