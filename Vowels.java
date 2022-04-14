package com.bridgeLabz.Vowels;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Vowels {
    static Logger logger = Logger.getLogger(Vowels.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        System.out.print("Enter any alphabet from (A To Z) : ");
        Scanner sc = new Scanner(System.in);
        char alp = sc.next().charAt(0);

        switch (alp) {
            case 'a' :
                logger.info("It is a vowel");
                break;
            case 'e' :
                logger.info("It is a vowel");
                break;
            case 'i' :
                logger.info("It is a vowel");
                break;
            case 'o' :
                logger.info("It is a vowel");
                break;
            case 'u' :
                logger.info("It is a vowel");
                break;
            default :
                logger.info("It is a consonent");
        }
    }
}
