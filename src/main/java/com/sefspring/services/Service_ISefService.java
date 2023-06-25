package com.sefspring.services;

import com.sefspring.dtos.HelloResponseDTO;

public interface Service_ISefService {
	HelloResponseDTO getHello(String nombre);
}
