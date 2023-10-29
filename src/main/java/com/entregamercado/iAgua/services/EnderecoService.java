package com.entregamercado.iAgua.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregamercado.iAgua.domain.Endereco;
import com.entregamercado.iAgua.repository.EnderecoRepository;
import com.entregamercado.iAgua.resource.exceptions.service.ObjectNotFoundException;

@Service
public class EnderecoService {
	
	
	@Autowired
	EnderecoRepository enderecoRepo;

	
	public List<Endereco> findAll(){
		return enderecoRepo.findAll();
	}
	
	public Endereco findById(String id) {
		Optional <Endereco> op = enderecoRepo.findById(id);
		return op.orElseThrow(()->new ObjectNotFoundException("Cliente não encontrado"));
	}
}
