package com.sefspring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sefspring.dtos.CountryNameResponseDTO;
import com.sefspring.services.Service_ICountryInfoService;

@RestController
public class CountryInfoServiceController {

	@Autowired
	private Service_ICountryInfoService serviceCountryInfo;

    @GetMapping("/countryname")
    public ResponseEntity<Map<String, String>> getNombre(@RequestParam String code) {
    	
    	CountryNameResponseDTO addResponse = serviceCountryInfo.getCountryName(code);
        
        Map<String, String> response = new HashMap<>();
        response.put("resultado", addResponse.getCountryNameResult());
        return ResponseEntity.ok().body(response);
    }
}