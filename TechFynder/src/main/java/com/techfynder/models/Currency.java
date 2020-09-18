package com.techfynder.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "currency_info")

public class Currency {
	
	@Id
	private String countryId;
	
	private String countryName;
	
	private String currencyType;
	
	private float valInUSD;
	
	private float curentcountrycurrency;
	
	public Currency() {
		
	}

	public Currency( String countryName, String currencyType, float valInUSD,
			float curentcountrycurrency) {
		super();
		
		this.countryName = countryName;
		this.currencyType = currencyType;
		this.valInUSD = valInUSD;
		this.curentcountrycurrency = curentcountrycurrency;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public float getValInUSD() {
		return valInUSD;
	}

	public void setValInUSD(float valInUSD) {
		this.valInUSD = valInUSD;
	}

	public float getCurentcountrycurrency() {
		return curentcountrycurrency;
	}

	public void setCurentcountrycurrency(float curentcountrycurrency) {
		this.curentcountrycurrency = curentcountrycurrency;
	}
	

}
