package com.entregamercado.iAgua.domainDTO;

import java.io.Serializable;

import com.entregamercado.iAgua.domain.Client;

public class ClientDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String nome;
	private String telefone;
	
	
	
	public ClientDTO() {
		super();
	}



	public ClientDTO(Client obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.telefone = obj.getTelefone();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
