package com.entregamercado.iAgua.domainDTO;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.entregamercado.iAgua.domain.Client;
import com.entregamercado.iAgua.domain.Endereco;

public class EnderecoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String bairro;
	private String logradouro;
	private String numero;
	
	
	public EnderecoDTO(Endereco obj) {
		super();
		this.id = obj.getId();
		this.bairro = obj.getBairro();
		this.logradouro =obj.getLogradouro();
		this.numero = obj.getNumero();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}
