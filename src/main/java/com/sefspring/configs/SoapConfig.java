package com.sefspring.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.sefspring.clients.CountryInfoClient;
import com.sefspring.clients.SefServiceClient;

@Configuration
public class SoapConfig {
	
	@Value("${soap.ws.sefservice.location}")	
	private String sefServiceWsUrl;
	
	@Value("${soap.ws.countryinfo.location}")	
	private String countryInfoWsUrl;
	
	@Value("${soap.ws.sefservice.generatedpackage}")	
	private String sefServiceGeneratedPackage;
	
	@Value("${soap.ws.countryinfo.generatedpackage}")	
	private String countryInfoGeneratedPackage;

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths( //estos son los generated packages
				sefServiceGeneratedPackage, 
				countryInfoGeneratedPackage);
        return marshaller;
    }
    
    @Bean
    public SefServiceClient getSefServiceClient(Jaxb2Marshaller marshaller){
    	SefServiceClient soapClient = new SefServiceClient();
        soapClient.setDefaultUri(sefServiceWsUrl); //location del webservice
        soapClient.setMarshaller(marshaller); //quien hace la serializacion
        soapClient.setUnmarshaller(marshaller); //quien hace la desserializacion

        return soapClient;
    }
    
    @Bean
    public CountryInfoClient getCountryInfoClient(Jaxb2Marshaller marshaller){
    	CountryInfoClient soapClient = new CountryInfoClient();
        soapClient.setDefaultUri(countryInfoWsUrl); //location del webservice
        soapClient.setMarshaller(marshaller); //quien hace la serializacion
        soapClient.setUnmarshaller(marshaller); //quien hace la desserializacion

        return soapClient;
    }
}