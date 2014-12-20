package com.main.listeners;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessage", namespace = "http://www.test.com/schema/CamelSpring/provisioning/v1_0/local", propOrder = { "message" })
public class GetMessage {

	@XmlElement(namespace = "http://www.test.com/schema/CamelSpring/provisioning/v1_0/local")
	protected String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
