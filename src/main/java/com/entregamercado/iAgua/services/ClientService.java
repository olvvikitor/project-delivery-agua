package com.entregamercado.iAgua.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregamercado.iAgua.domain.Client;
import com.entregamercado.iAgua.repository.ClientRepository;
import com.entregamercado.iAgua.resource.exceptions.service.ObjectNotFoundException;

@Service
public class ClientService {
	
	
	@Autowired
	ClientRepository clientRepo;

	
	public List<Client> findAll(){
		return clientRepo.findAll();
	}
	
	public Client findById(String id) {
		Optional <Client> op = clientRepo.findById(id);
		return op.orElseThrow(()->new ObjectNotFoundException("Cliente não encontrado"));
	}
}
