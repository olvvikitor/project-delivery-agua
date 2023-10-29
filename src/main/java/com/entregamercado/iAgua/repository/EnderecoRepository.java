package com.entregamercado.iAgua.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.entregamercado.iAgua.domain.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String> {

}
