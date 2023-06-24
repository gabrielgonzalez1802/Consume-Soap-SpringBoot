package com.sefspring.clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.sefspring.wsdls.countryinfo.CountryName;
import com.sefspring.wsdls.countryinfo.CountryNameResponse;

public class CountryInfoClient extends WebServiceGatewaySupport {
	
	@Value("${soap.ws.countryinfo.location}")	
	private String wsUrl;
	
	@Value("${soap.ws.countryinfo.targetNamespace}")	
	private String targetNamespace;
	
	public CountryNameResponse getCountryName(String code) {

		CountryName request = new CountryName();
		request.setSCountryISOCode(code);
				
	    CountryNameResponse response = (CountryNameResponse) getWebServiceTemplate()
	    .marshalSendAndReceive(
	    		wsUrl,
	    			request ,
	                    new SoapActionCallback(targetNamespace));
	    
		return response;
	}

}