package com.entregamercado.iAgua.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entregamercado.iAgua.domain.Product;
import com.entregamercado.iAgua.domainDTO.ProductDTO;
import com.entregamercado.iAgua.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll(){
		List<Product>obj = service.findAll();
		List<ProductDTO> objDTO = obj.stream().map(x-> new ProductDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(objDTO);
	}

}
