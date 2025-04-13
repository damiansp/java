package com.mycompany.oop;

/**
 *
 * @author damiansp
 */
public class Staff {
    private String name;
    private final int hourlyRate = 30;
    private int hoursWorked;
    
    public Staff(String name) {
        this.name = name;
        System.out.println("\n" + this.name + "\n----------------------------");
    }
    
    public Staff(String name, String surname) {
        this.name = name + " " + surname;
        System.out.println("\n" + this.name + "\n----------------------------");
    }
    
    public int getHoursWorked() { return hoursWorked; }
    
    public void setHoursWorked(int hours) {
        if (hours > 0) { hoursWorked = hours; }
        else {
            System.out.println("Error: hoursWorked cannot be < 0");
        }
    }
    
    public void printMessage() { System.out.println("Calculating pay..."); }
    
    public int calculatePay() {
        printMessage();
        int pay = hoursWorked * hourlyRate;
        if (hoursWorked > 0) { return pay; } 
        else { return -1; }  // odd choice
    }
    
    public int calculatePay(int bonus, int allowance) {
        printMessage();
        if (hoursWorked > 0) { 
            return hoursWorked*hourlyRate + bonus + allowance;
        } else { return 0; }
    }
}
