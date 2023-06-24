package com.sefspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sefspring.clients.CountryInfoClient;
import com.sefspring.clients.SefServiceClient;
import com.sefspring.wsdls.countryinfo.CountryNameResponse;
import com.sefspring.wsdls.sefservice.HelloResponse;

@SpringBootApplication
public class SpringBootSoapApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SefServiceClient quoteClient) {
		return args -> {
			String nombre = "Gabriel";

			HelloResponse response = quoteClient.getHello(nombre);
			LOGGER.info(response.getReturn());
		};
	}
	
	@Bean
	CommandLineRunner lookup2(CountryInfoClient quoteClient) {
		return args -> {
			String code = "VEN";

			CountryNameResponse response = quoteClient.getCountryName(code);
			LOGGER.info(response.getCountryNameResult());
		};
	}

}