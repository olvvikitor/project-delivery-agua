package com.entregamercado.iAgua.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.entregamercado.iAgua.domain.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

}
