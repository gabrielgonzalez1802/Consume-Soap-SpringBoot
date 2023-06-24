package com.sefspring.services;

import com.sefspring.wsdls.countryinfo.CountryNameResponse;

public interface Service_ICountryInfoService {
	CountryNameResponse getCountryName(String code);
}