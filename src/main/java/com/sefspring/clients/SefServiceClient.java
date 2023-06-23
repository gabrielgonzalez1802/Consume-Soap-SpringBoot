package com.sefspring.clients;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.sefspring.wsdls.Hello;
import com.sefspring.wsdls.HelloResponse;
import com.sefspring.wsdls.ObjectFactory;

public class SefServiceClient extends WebServiceGatewaySupport {

	public HelloResponse getHello(String name) {

		Hello request = new Hello();
		request.setName(name);
		
	    ObjectFactory of = new ObjectFactory();
	    JAXBElement<Hello> reqjaxb = of.createHello(request);
	    
	    @SuppressWarnings("unchecked")
	    JAXBElement<HelloResponse> response = (JAXBElement<HelloResponse>) getWebServiceTemplate()
	    .marshalSendAndReceive(
	    		"http://10.161.169.27:8512/SefMainServices/SefService",
	                    reqjaxb ,
	                    new SoapActionCallback("http://service.sefws.telefonica.com.ve/hello"));
	    
		return response.getValue();
	}

}