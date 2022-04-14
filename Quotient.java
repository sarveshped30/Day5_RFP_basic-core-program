package com.bridgeLabz.Quetiont;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Quotient {
    static Logger logger = Logger.getLogger(Quotient.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Scanner sc = new Scanner(System.in);
        logger.info("Enter the number1: ");
        int num1 = sc.nextInt();
        logger.info("Enter the number2: ");
        int num2 = sc.nextInt();

        float quotient = num1 / num2;
        float remainder = num1 % num2;

        logger.info("Quotient is " + quotient);
        logger.info("Remainder is " + remainder);
    }
}
