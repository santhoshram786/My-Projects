package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
public class Demo {

	//Here Logmanager is an API and Logger is  a class
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(10>4)
		{
			log.info("Ïnfo log");
			log.fatal("fatal error");
			log.error("error log ");
		}
		else
			log.error("errorlog ");

	}

}
