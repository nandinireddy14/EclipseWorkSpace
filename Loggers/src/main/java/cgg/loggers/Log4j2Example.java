package cgg.loggers;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4j2Example {
	private static final Logger logger=LogManager.getLogger(Log4j2Example.class);
	public static void main(String[] args) {
		logger.trace("trace message");
		logger.trace("debug message");
		
		int [] numbers= {1,2,3,4,5};
		for(int i=0;i<6;i++)
		{
			try {
				logger.debug("Value at index {} :{}",i,numbers[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{ logger.debug(e.getMessage());
				
			}
		}
	}

}
