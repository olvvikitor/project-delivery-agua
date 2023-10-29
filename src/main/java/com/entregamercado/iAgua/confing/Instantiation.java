package com.entregamercado.iAgua.confing;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.entregamercado.iAgua.domain.Client;
import com.entregamercado.iAgua.domain.Endereco;
import com.entregamercado.iAgua.domain.Product;
import com.entregamercado.iAgua.repository.ClientRepository;
import com.entregamercado.iAgua.repository.EnderecoRepository;
import com.entregamercado.iAgua.repository.ProductRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private ClientRepository clientRepo;
	
	@Autowired
	private EnderecoRepository enderecoRepo;

	@Override
	public void run(String... args) throws Exception {
		
		productRepo.deleteAll();
		clientRepo.deleteAll();
		enderecoRepo.deleteAll();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Product p1 = new Product(null,"itagy",7.50,100,sdf.parse("10/10/2021"),sdf.parse("10/10/2024"));
		Endereco e1 = new Endereco("44052-082", "540"); 
		Client c1 = new Client(null,"emyle","75983633860","Emyle@gmail","09216647531",sdf.parse("03/01/2003"),"123",e1);
		
		enderecoRepo.save(e1);
		productRepo.save(p1);
		clientRepo.save(c1);
		
	}

}
