package com.mycompany.arraysstrings;

/**
 *
 * @author damiansp
 */
public class ArraysStrings {

    public static void main(String[] args) {
        String message = "Hello, World!";
        String sub = message.substring(7);  // World!
        String sub2 = message.substring(1, 9);
        String anotherMessage = "";
        String name = "Bob " + "Dobolina";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(sub);
        System.out.println(sub2);
    }
}
