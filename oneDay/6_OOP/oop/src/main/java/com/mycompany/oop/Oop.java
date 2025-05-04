package com.mycompany.oop;

import java.util.Arrays;

/**
 *
 * @author damiansp
 */
public class Oop {

    public static void main(String[] args) {
        Staff cook = new Staff("Peter");
        cook.setHoursWorked(160);
        int pay = cook.calculatePay(1000, 400);
        System.out.println("Cook's pay: $" + pay);
        
        Staff custodian = new Staff("Jane", "Lee");
        custodian.setHoursWorked(160);
        pay = custodian.calculatePay();
        System.out.println("Custodian's pay: $" + pay);
        
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.message);
        sd.displayMessage();
        System.out.println(StaticDemo.greetings);
        StaticDemo.displayGreetings();
        
        ArrayMethods am = new ArrayMethods();
        int[] myArray = {1, 2, 3, 4, 5};
        am.printFirstElement(myArray);
        int[] yourArray = am.returnArray();
        System.out.println(Arrays.toString(yourArray));
        
        int n = 2;
        System.out.println("n: " + n);
        passPrimitive(n);
        System.out.println("n: " + n);
        
        int[] ns = {0, 1, 2};
        System.out.println("ns[0]: " + ns[0]);
        passRef(ns);
        System.out.println("ns[0]: " + ns[0]);
    }
    
    public static void passPrimitive(int prim) {
        prim++;
        System.out.println("In method: " + prim);
    }
    
    public static void passRef(int[] ref) {
        ref[0]++;
        System.out.println("In method: " + ref[0]);
    }
}


