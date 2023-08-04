package cgg.loggers;

import org.apache.log4j.Logger;


public class ExampleDemo2 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ExampleDemo2.class);
		logger.trace("Trace Level Meassage");
		logger.debug("Debug Level Message");
		logger.info("Info Level Message");
		logger.warn("Warn Message");
		logger.error("Error Message");
	}

}
