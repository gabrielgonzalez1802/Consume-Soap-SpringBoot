package com.sefspring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sefspring.services.Service_IHello;
import com.sefspring.wsdls.HelloResponse;

@RestController
public class SefServiceController {

	@Autowired
	private Service_IHello serviceHello;

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> getNombre(@RequestParam String nombre) {

        HelloResponse addResponse = serviceHello.obtenerNombre(nombre);

        Map<String, String> response = new HashMap<>();
        response.put("resultado", addResponse.getReturn());
        return ResponseEntity.ok().body(response);
    }
}