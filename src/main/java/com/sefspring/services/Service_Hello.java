package com.sefspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefspring.clients.SefServiceClient;
import com.sefspring.wsdls.HelloResponse;

@Service
public class Service_Hello  implements Service_IHello {
	
	@Autowired
	private SefServiceClient sfsClient;

	@Override
	public HelloResponse obtenerNombre(String nombre) {
		return sfsClient.getHello(nombre);
	}
}