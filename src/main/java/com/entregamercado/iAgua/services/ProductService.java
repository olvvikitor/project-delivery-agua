package com.entregamercado.iAgua.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregamercado.iAgua.domain.Product;
import com.entregamercado.iAgua.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepostory;
	
	public List<Product> findAll(){
		return productRepostory.findAll();
	}
	
}
