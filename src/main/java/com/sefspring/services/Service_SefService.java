package com.sefspring.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefspring.clients.SefServiceClient;
import com.sefspring.dtos.HelloResponseDTO;

@Service
public class Service_SefService  implements Service_ISefService {
	
	@Autowired
	private SefServiceClient sfsClient;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public HelloResponseDTO getHello(String nombre) {
		return modelMapper.map(
				sfsClient.getHello(nombre), 
				HelloResponseDTO.class);
	}
}