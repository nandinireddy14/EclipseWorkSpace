package cgg.loggers;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleDemo1 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ExampleDemo1.class.getName());
		logger.setLevel(Level.SEVERE);
		logger.setLevel(Level.INFO);
		logger.setLevel(Level.WARNING);
		logger.log(Level.INFO,"This is an info message");
		logger.log(Level.WARNING,"This is an warning message");
		logger.log(Level.SEVERE,"This is an severe message");
	}

}
