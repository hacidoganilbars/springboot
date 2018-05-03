package com.doganilbars.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.doganilbars.entities.Product;

public interface IProductRepository extends CrudRepository<Product, String>{

	@Query("{$and:[{price:{$gte:?0}},{price:{$lte: ?1}}]}")
	public List<Product> between(double minPrice,double maxPrice);
	
}
