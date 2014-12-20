package com.main;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.sun.istack.logging.Logger;

public class TestRouter implements Processor {
private static Logger logger=Logger.getLogger(TestRouter.class);
	public void process(Exchange exchange) throws Exception {
		logger.info("-----TestRouter Called----------");
		String message = exchange.getIn().getBody(String.class);
		logger.info("Messgae :: " + message);
	}

}
