package com.sefspring;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

//import com.sartmainservices.clients.HelloClient;
//import com.sartmainservices.wsdls.HelloResponse;

@SpringBootApplication
public class SpringBootSoapApplication {
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}

//	@Bean
//	CommandLineRunner lookup(HelloClient quoteClient) {
//		return args -> {
//			String nombre = "Gabriel";
//
//			HelloResponse response = quoteClient.getHello(nombre);
//			System.err.println(response.getReturn());
//		};
//	}

}