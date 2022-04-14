package com.bridgeLabz.LargestNum;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LargestNum {
    static Logger logger = Logger.getLogger(LargestNum.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        int num1 = 100;
        int num2 = 300;
        int num3 = 50;
        int max = 0;

        if(num1 > max) {
            max = num1;
        }
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }

        logger.info("Maximum number is " + max);
    }
}
