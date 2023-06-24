package com.sefspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefspring.clients.CountryInfoClient;
import com.sefspring.wsdls.countryinfo.CountryNameResponse;

@Service
public class Service_CountryInfoService implements Service_ICountryInfoService {
	
	@Autowired
	private CountryInfoClient countryInfoClient;
	
	@Override
	public CountryNameResponse getCountryName(String code) {
		return countryInfoClient.getCountryName(code);
	}

}