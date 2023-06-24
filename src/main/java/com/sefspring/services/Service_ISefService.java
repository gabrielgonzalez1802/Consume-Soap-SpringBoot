package com.sefspring.services;

import com.sefspring.wsdls.sefservice.HelloResponse;

public interface Service_ISefService {
	HelloResponse getHello(String nombre);
}
