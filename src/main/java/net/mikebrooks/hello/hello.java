// ***************************************************************
//
// Implementing a basic Header
// Copyright MikeBrooks.Net 2025
//
// ***************************************************************
package net.mikebrooks.hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Properties;

public class hello {

    private static final Logger logger = LogManager.getLogger("hello");


	public static int add(int x, int y) {
		int retval; // I know we don't really need this...

		// how stupid is it that the following lines were generated and I didn't have to do anything...

		retval = x + y;
		return retval;

	}
	public static int subtract(int x, int y) {
		int retval; // I know we don't really need this...

		// how stupid is it that the following lines were generated and I didn't have to do anything...

		retval = x - y;
		return retval;

	}
	public static int mul(int x, int y) {
		int retval; // I know we don't really need this...

		// how stupid is it that the following lines were generated and I didn't have to do anything...

		retval = x * y;
		return retval;

	}

	public static int div(int x, int y) {
		int retval; // I know we don't really need this...

		// how stupid is it that the following lines were generated and I didn't have to do anything...

		retval = x / y;
		return retval;

	}





	public static void main(String[] args) {

		//System.setProperties("log4j.configurationFile", "C:\\source\\helloworld\\log4j2.xml");	//"FILE_PATH");
    	//Logger logger = LogManager.getRootLogger();
    	//logger.trace("Configuration File Defined To Be :: "+System.getProperty("log4j.configurationFile"));

        logger.info("Hello, World!");

		System.out.println("Hello Java World!");
	}
}

