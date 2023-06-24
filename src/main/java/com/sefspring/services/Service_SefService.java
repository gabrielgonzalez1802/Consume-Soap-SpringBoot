package com.sefspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefspring.clients.SefServiceClient;
import com.sefspring.wsdls.sefservice.HelloResponse;

@Service
public class Service_SefService  implements Service_ISefService {
	
	@Autowired
	private SefServiceClient sfsClient;

	@Override
	public HelloResponse getHello(String nombre) {
		return sfsClient.getHello(nombre);
	}
}