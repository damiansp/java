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
        
        Staff custodian = new Staff("Jane", "Lee");
        custodian.setHoursWorked(160);
        pay = custodian.calculatePay();
        System.out.println("Custodian's pay: $" + pay);
        
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.message);
        sd.displayMessage();
        System.out.println(StaticDemo.greetings);
        StaticDemo.displayGreetings();
    }
}


