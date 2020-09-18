package com.techfynder.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.techfynder.models.Currency;
import com.techfynder.service.TechFynderService;


@RestController
@RequestMapping("/techfynder")
public class TechfynderController {
	
	@Autowired
	private TechFynderService service;
	
	
	@GetMapping("/currencies")
	public List<Currency> getAllCurrencies()
	{
		return service.getAllCurrenices();
	}
	
	
	
	
	
	@PostMapping("/currencies")
	public  ResponseEntity addStudent(@RequestBody Currency c)
	{
		Currency saved=service.addCurrency(c);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getCountryId()).toUri();  
		return ResponseEntity.created(location).build();
		
	}
	

	
	

}