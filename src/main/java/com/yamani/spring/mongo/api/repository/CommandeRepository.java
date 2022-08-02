package com.yamani.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yamani.spring.mongo.api.model.Commande;


public interface CommandeRepository extends MongoRepository<Commande, String>{

}
