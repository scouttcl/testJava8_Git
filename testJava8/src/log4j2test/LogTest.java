package log4j2test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {

//	static Logger logger = LogManager.getLogger(LogTest.class);
	static Logger logger = LogManager.getLogger("testLogger1");
	public static void main(String[] args) {
		
		logger.info("log4j2 info: Hello world!");
		logger.debug("log4j2 debug: Hello world!");
		putLog();
	}
	
	public static void putLog() {
		logger.debug("put log");
	}

}
