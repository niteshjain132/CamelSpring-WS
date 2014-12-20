package com.main;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetMessageProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"META-INF/spring/camel_spring-ws.xml");
		CamelContext context = ac.getBean("test",CamelContext.class);

		Exchange myExchange = new DefaultExchange(context);
		exchange.getIn().setBody("Hello");
		
		ProducerTemplate template = context.createProducerTemplate();
		template.send("direct:start", myExchange);
		
	}

}
