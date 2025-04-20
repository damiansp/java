package com.mycompany.oop;

/**
 *
 * @author damiansp
 */
public class ArrayMethods {
    public void printFirstElement(int[] a) {
        System.out.println("The first elements is: " + a[0]);
    }
    
    public int[] returnArray() {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) { a[i] = i * 2; }
        return a;
    }
}
