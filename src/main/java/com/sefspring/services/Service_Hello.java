package com.sefspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefspring.clients.HelloClient;
import com.sefspring.wsdls.HelloResponse;

@Service
public class Service_Hello  implements Service_IHello {
	
	@Autowired
	private HelloClient helloClient;

	@Override
	public HelloResponse obtenerNombre(String nombre) {
		return helloClient.getHello(nombre);
	}
}