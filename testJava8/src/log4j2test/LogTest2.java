package log4j2test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest2 {

	static Logger logger = LogManager.getLogger("testLogger2");
	public static void main(String[] args) {
		
		logger.warn("log4j2 warn: Hello log4j 2.x!");
		logger.error("log4j2 error: Hello log4j 2.x!");

	}

}
