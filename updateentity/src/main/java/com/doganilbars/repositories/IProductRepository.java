package com.doganilbars.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doganilbars.entities.Product;

@Repository("productRepository")
public interface IProductRepository extends CrudRepository<Product, Integer> {

}
