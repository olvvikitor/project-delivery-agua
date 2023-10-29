package com.entregamercado.iAgua.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String marca;
	private Double preco;
	private Integer estoque;
	private Date fabricacao;
	private Date vencimento;
	
	
	public Product() {
		super();
	}
	
	public Product(String id, String marca, Double preco, Integer estoque, Date fabricacao,Date validade) {
		super();
		this.id = id;
		this.marca = marca;
		this.preco = preco;
		this.estoque = estoque;
		this.fabricacao = fabricacao;
		this.vencimento = validade;
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


	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Integer getEstoque() {
		return estoque;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

	
}
