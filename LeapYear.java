package com.bridgeLabz.leapYear;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class LeapYear {
    static Logger logger = Logger.getLogger(LeapYear.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("Enter the year (four digit number) : ");
        Scanner sc = new Scanner(System.in);        //Taking user input
        int year = sc.nextInt();

        //Checking if the entered year is 4-digit number
        if(year > 999 && year < 10000) {
            if(year%400 == 0) {
                logger.info("leap year");
            }else if(year%100 == 0) {
                logger.info("Not a leap year");
            }else if(year%4 == 0) {
                logger.info("leap year");
            }else {
                logger.info("Not a leap year");
            }
        }else {
            logger.info("Invalid number!.....");
        }
    }
}
