package com.mycompany.arraysstrings;

/**
 *
 * @author damiansp
 */
public class ArraysStrings {

    public static void main(String[] args) {
        /* Strings */
        String message = "Hello, World!";
        String sub = message.substring(7);  // World!
        String sub2 = message.substring(1, 9);
        String anotherMessage = "";
        String name = "Bob " + "Dobolina";
        String[] msgParts = message.split(", ");
        char firstChar = message.charAt(0);
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(sub);
        System.out.println(sub2);
        System.out.println(firstChar);
        System.out.println(message.equals(name));
        System.out.println(msgParts[1]);
        
        /* Arrays */
        int[] userAges = {50, 48, 44, 42};
        int[] yob = new int[4];
        userAges[1]++;
    }
}
