package com.entregamercado.iAgua.domainDTO;

import java.io.Serializable;

import com.entregamercado.iAgua.domain.Product;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String marca;
	private Double preco;

	public ProductDTO() {
		super();
	}

	public ProductDTO(Product obj) {
		super();
		this.id = obj.getId();
		this.marca = obj.getMarca();
		this.preco = obj.getPreco();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
