package com.techfynder.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.techfynder.models.Currency;
import com.techfynder.repository.TechfynderRepository;
import com.techfynder.service.TechFynderService;

@SpringBootTest
public class TechFynderServiceTests {
	
	@Autowired
	TechFynderService service;
	
	@MockBean
	TechfynderRepository repo;
	
	

	@Test
	public void testAllCurrenciesWhenRepoReturnNull() {
		when(repo.findAll())
        .thenReturn(null);
		assertEquals(new ArrayList<Currency>(), service.getAllCurrenices());
	
	}
	
	
	@Test
	public void CurrenciesWhenRepoReturnEmptyCurrencytest() {
		Currency currency=new Currency();
		List<Currency> list=new ArrayList<>();
		list.add(currency);
		
		when(repo.findAll())
        .thenReturn(list);
		assertEquals(null, service.getAllCurrenices().get(0));
	
	}



}
