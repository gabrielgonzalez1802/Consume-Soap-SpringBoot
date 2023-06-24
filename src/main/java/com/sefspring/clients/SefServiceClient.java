package com.sefspring.clients;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.sefspring.wsdls.sefservice.Hello;
import com.sefspring.wsdls.sefservice.HelloResponse;
import com.sefspring.wsdls.sefservice.ObjectFactory;

public class SefServiceClient extends WebServiceGatewaySupport {

	@Value("${soap.ws.sefservice.location}")	
	private String wsUrl;
	
	@Value("${soap.ws.sefservice.targetNamespace}")	
	private String targetNamespace;
	
	public HelloResponse getHello(String name) {

		Hello request = new Hello();
		request.setName(name);
		
	    ObjectFactory of = new ObjectFactory();
	    JAXBElement<Hello> reqjaxb = of.createHello(request);
	    
	    @SuppressWarnings("unchecked")
	    JAXBElement<HelloResponse> response = (JAXBElement<HelloResponse>) getWebServiceTemplate()
	    .marshalSendAndReceive(
	    		wsUrl,
	                    reqjaxb ,
	                    new SoapActionCallback(targetNamespace));
	    
		return response.getValue();
	}

}