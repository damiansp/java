package com.mycompany.inheritance;

import java.util.Scanner;

 
public class Member {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;
    
    public Member() {
        System.out.println("Parent constructor, no params");
    }
    
    public Member(String name, int id, int memberSince) {
        this.name = name;
        memberID = id;
        this.memberSince = memberSince;
        System.out.println("Parent constructor, 3 params");
    }
    
    public double getDiscount() { return discount; }
    
    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter admin password: ");
        String password = input.nextLine();
        if (password.equals("abcd")) {
            System.out.print("Enter discount: ");
            discount = input.nextInt();
        } else {
            System.out.println("Invalid pasword, cannot edit discount");
        }
    }
    
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + memberID);
        System.out.println("Member since: " + memberSince);
        System.out.println("Annual Fee: $" + annualFee);
    }
    
    public void calculateAnnualFee() {
        annualFee = 0;
    }
}
