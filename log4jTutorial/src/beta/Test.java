package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
public class Test {

	//Here Logmanager is an API and Logger is  a class
	private static Logger log=LogManager.getLogger(Test.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(10>4)
		{
			log.info("Ïnfo log");
			log.fatal("fatal error");
			log.error("error log ");
			log.error("second error");
		}
		else
		
		log.info("second Ïnfo log");

	}

}
