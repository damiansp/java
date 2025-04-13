package com.mycompany.oop;

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
    }
}


