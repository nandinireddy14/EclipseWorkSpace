package cgg.loggers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ExampleDemo4 {
	private static final Logger logger=LoggerFactory.getLogger(ExampleDemo4.class);
	public static void main(String[] args) {
		setTemp(45);
		setTemp(48);

	}

	static Integer t;
	static Integer OldT;
	private static void setTemp(int temp) {
		OldT=t;
		t=temp;
		logger.debug("Temperature set to {} . Old temperature was {}",t,OldT);
		if(temp>50) {
			logger.debug("Temperature is raised to 50 degrees");
		}
	}

}
