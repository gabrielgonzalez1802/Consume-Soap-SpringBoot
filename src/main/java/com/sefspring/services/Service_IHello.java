package com.sefspring.services;

import com.sefspring.wsdls.HelloResponse;

public interface Service_IHello {
	HelloResponse obtenerNombre(String nombre);
}
