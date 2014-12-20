package com.main.listeners;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CamelSpring", targetNamespace = "http://www.test.com/wsdl/CamelSpring/provisioning/v1_0/interface")
public interface CamelSpring {

	@WebMethod(action = "document")
	@WebResult(name = "hazelCastCaching")
	@RequestWrapper(localName = "getMessage", targetNamespace = "http://www.test.com/schema/CamelSpring/provisioning/v1_0/local", className = "com.main.GetMessage")
	@ResponseWrapper(localName = "getMessageResponse",targetNamespace = "http://www.test.com/schema/CamelSpring/provisioning/v1_0/local", className = "com.main.GetMessageResponse")
	public String getMessage(@WebParam(name = "message") String message)
			throws Exception;

}
