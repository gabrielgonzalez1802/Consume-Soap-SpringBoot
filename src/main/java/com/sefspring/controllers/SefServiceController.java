package com.sefspring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sefspring.dtos.HelloResponseDTO;
import com.sefspring.services.Service_ISefService;

@RestController
public class SefServiceController {

	@Autowired
	private Service_ISefService serviceHello;

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> getNombre(@RequestParam String nombre) {
    	
    	HelloResponseDTO addResponse = serviceHello.getHello(nombre);
        
        Map<String, String> response = new HashMap<>();
        response.put("resultado", addResponse.get_return());
        return ResponseEntity.ok().body(response);
    }
}