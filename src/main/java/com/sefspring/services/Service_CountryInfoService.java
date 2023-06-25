package com.sefspring.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefspring.clients.CountryInfoClient;
import com.sefspring.dtos.CountryNameResponseDTO;

@Service
public class Service_CountryInfoService implements Service_ICountryInfoService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CountryInfoClient countryInfoClient;
	
	@Override
	public CountryNameResponseDTO getCountryName(String code) {
		return modelMapper.map(
				countryInfoClient.getCountryName(code), 
				CountryNameResponseDTO.class);
	}

}