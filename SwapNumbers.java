package com.bridgeLabz.SwapNumbers;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SwapNumbers {
    static Logger logger = Logger.getLogger(SwapNumbers.class);
    public static void main(String[] arsg) {
        BasicConfigurator.configure();

        int temp;
        int num1 = 5;
        int num2 = 10;

        logger.info("Before swapping num1 = " + num1);
        logger.info("Before swapping num2 = " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        logger.info("After swapping num1 = " + num1);
        logger.info("After swapping num2 = " + num2);
    }
}
