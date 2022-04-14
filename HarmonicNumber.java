package com.bridgeLabz.harmonicNum;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class HarmonicNumber {
    static Logger logger = Logger.getLogger(HarmonicNumber.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("Enter number n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //Taking user input
        float harmonicNum = 0;

        //Checking if n is not equals to 0
        if(n != 0) {
            for (int i = 1; i <= n; i++) {
                harmonicNum += (float) 1 / i;
            }
            logger.info("Nth Harmonic value is : " + harmonicNum);
        } else {
            logger.info("Invalid number!...");
        }
    }
}
