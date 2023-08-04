package cgg.loggers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleDemo3 {
	static Logger logger = LoggerFactory.getLogger(ExampleDemo3.class);
	public static void main(String[] args) {
		logger.info("Initializing application");
		ArrayList<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add(null);
		list.add(null);
		list.add("DEF");
		processItems(list);
	}
	private static void processItems(ArrayList<String> list) {
		try {
			logger.debug("Processing items");
			for(String item: list)
			{
				if(item==null)
				{
					logger.warn("Encountered null item..skipping..");
				}
				logger.info("Processuing : {}",item);
				
			}
			logger.debug("Item processing complete");
		}
		catch(Exception e)
		{
			logger.error("Error processing items : {}",e.getMessage());
		}
		
	}

}
