package com.doganilbars.repositories;

import org.springframework.data.repository.CrudRepository;

import com.doganilbars.entities.Product;

public interface IProductRepository extends CrudRepository<Product, Integer> {

}
