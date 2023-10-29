package com.entregamercado.iAgua.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.entregamercado.iAgua.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}
