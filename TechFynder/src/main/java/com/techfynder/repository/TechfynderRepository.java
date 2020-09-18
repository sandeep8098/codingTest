package com.techfynder.repository;


import org.springframework.data.mongodb.repository.MongoRepository;


import com.techfynder.models.Currency;


public interface TechfynderRepository extends MongoRepository<Currency, String> { 
	
	

}
