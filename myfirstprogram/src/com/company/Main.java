/*
* Java Development (K)
*
* Version 1
*
*Performed by Selebynka Yurii (UzhNU)
*/

package com.company;

public class Main {

    public static void main(String[] args) {
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
    }
}
