package com.entregamercado.iAgua.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entregamercado.iAgua.domain.Client;
import com.entregamercado.iAgua.domainDTO.ClientDTO;
import com.entregamercado.iAgua.services.ClientService;

@RestController
@RequestMapping(value= "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<ClientDTO>>findAll(){
		List<Client>obj = service.findAll();
		List<ClientDTO> objDTO =obj.stream().map(x-> new ClientDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(objDTO);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Client> findById(@PathVariable String id) {
		Client obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
