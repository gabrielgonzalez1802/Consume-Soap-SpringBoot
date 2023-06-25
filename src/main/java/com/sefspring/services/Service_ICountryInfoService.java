package com.sefspring.services;

import com.sefspring.dtos.CountryNameResponseDTO;

public interface Service_ICountryInfoService {
	CountryNameResponseDTO getCountryName(String code);
}