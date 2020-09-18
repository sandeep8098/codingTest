package com.techfynder.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.techfynder.models.Currency;
import com.techfynder.repository.TechfynderRepository;

@Service
public class TechFynderService {
	
	private TechfynderRepository repository;
	
	public List<Currency> getAllCurrenices()
	{
		List<Currency> list=new ArrayList<Currency>();
		repository.findAll().forEach(list::add);
		return list;
	}
	
	
	public Currency addCurrency(Currency c)
	{
		c=repository.save(c);
		return c;
	}

}
