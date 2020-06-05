/*
*
* Classame : Java Development (K)
*
*  31 May 2020
*
* Copyright Selebynka Yurii (UzhNU)
*
*  Module 1 Cycle practice
*
* 1. Write to console 8 facts about yourself using primitive types;
* 2.  Check a string as a palindrome;
* 3.  Get the area limited by the following functions
* x = 0 .. 3.14;    y = sin(x);   y = 0.1 * k,
* where k is the last number of birthday.
*
* */

package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1. Write to console 8 facts about yourself using primitive types.
	    byte age = 24;
	    short height = 160;
        float weight = 68.9f;
        double myIQ = 125.11;
        long nervelenght = 75_000_000_000_000l;
        int mydesiredwealth = 1_000_000_000;
        char mysign = 'Y';
        boolean ithinkthereforeiam = true;
        String aboutMyself = "My name is Yurii." + "\n" + "I am " + age + " years old." +
                 "\n" + "My height is " + height + "cm. My weight is " + weight + "kg." +
                "\n" + "My IQ is " + myIQ + ". " + "Nerve fibers length is " + nervelenght
               + "nm." + "\n" + "My dream is " + mydesiredwealth + "USD. " +
               "My sign is " + mysign + "." + "\n" + "I think therefore i Am is "
               + ithinkthereforeiam + ".";
        System.out.println(aboutMyself);
        System.out.println( "Total lenght of text is " + aboutMyself.length() + " symbols");

    //*************************************************************************************\\

        // 2.  Check a string as a palindrome.

        String[] sentences = new String[5];
        sentences[0] = "А в Енисее – синева.";
        sentences[1] = "А за работу дадут? – Оба раза!";
        sentences[2] = "А к долу лодка.";
        sentences[3] = "А кобыле цена дана, да не целы бока.";
        sentences[4] = "А Луна канула.";

        for(int i = 0; i < sentences.length; i++){


            sentences[i] = sentences[i].replaceAll("\\ ", "");
            sentences[i] = sentences[i].replaceAll("\\–", "");
            sentences[i] = sentences[i].replaceAll("\\.", "");
            sentences[i] = sentences[i].replaceAll("\\,", "");
            sentences[i] = sentences[i].replaceAll("\\?", "");
            sentences[i] = sentences[i].replaceAll("\\!", "");
            sentences[i] = sentences[i].toLowerCase();

            String template = "";

            for ( int k = 0; k < sentences[i].length(); k++) {
                int index = sentences[i].length() - k - 1;
                template += sentences[i].charAt(index); }



            if (sentences[i].equals(template)) {
                System.out.println("This sentence is palindrome");
            } else {
                System.out.println("This sentence is not palindrome");
            }
        }

    //*************************************************************************************\\

        // 3.  Get the area limited by the following functions.

        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double y = 0.6; // my birthday is 06.05

        double area = 0;


        for (double x = 0; x < finish; x += deltaX) {
            double rectangle = 0;
            if (Math.sin(x) < y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }
            area += rectangle;
        }
            System.out.println(area);
    }
}



