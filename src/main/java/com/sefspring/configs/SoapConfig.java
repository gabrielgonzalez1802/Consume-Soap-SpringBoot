package com.sefspring.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.sefspring.clients.HelloClient;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.sefspring.wsdls"); //este es el generated package
        return marshaller;
    }
    
    @Bean
    public HelloClient getSoapClient(Jaxb2Marshaller marshaller){
    	HelloClient soapClient = new HelloClient();
        soapClient.setDefaultUri("http://10.161.169.27:8512/SefMainServices/SefService"); //location del webservice
        soapClient.setMarshaller(marshaller); //quien hace la serializacion
        soapClient.setUnmarshaller(marshaller); //quien hace la desserializacion

        return soapClient;
    }
}
