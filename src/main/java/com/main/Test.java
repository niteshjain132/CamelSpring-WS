package com.main;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.DefaultExchange;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"camel_spring.xml");
		CamelContext context = ac.getBean("test",CamelContext.class);

		Exchange exchange = new DefaultExchange(context);
		exchange.getIn().setBody("Hello");
		
		ProducerTemplate template = context.createProducerTemplate();
		template.send("direct:start", exchange);
	}
}
