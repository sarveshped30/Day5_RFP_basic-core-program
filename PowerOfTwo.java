package com.bridgeLabz.powerOf2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class PowerOfTwo {
    static Logger logger = Logger.getLogger(PowerOfTwo.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        int n = Integer.parseInt(args[0]);        //Storing command line argument in variable n
        int value;

        //Checking n is greater tah 0 and less than 31
        if(0 < n && n < 31) {
            //Iterating loop for n number of times
            for (int i = 1; i <= n; i++) {
                value = 2 ^ i;
                logger.info(i + "] Power of 2^" + i + " = " + value);
            }
        }else {
            logger.info("Invalid Number!...");
        }
    }
}
