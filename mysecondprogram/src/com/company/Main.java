/*
 * Java Development (K)
 *
 * Version 1
 *
 *Performed by Selebynka Yurii (UzhNU)
 */
package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

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

            //System.out.println(template);

            if (sentences[i].equals(template)) {
                System.out.println("This sentence is palindrome");
            } else {
                System.out.println("This sentence is not palindrome");
            }
            }
    }
    }


