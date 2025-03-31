package com.mycompany.controlflow;


import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author damiansp
 */
public class Controlflow {
    public static void main(String[] args) {
        int num, denom;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Numerator: ");
            num = input.nextInt();
            System.out.print("Denominator: ");
            denom = input.nextInt();
            System.out.println("Quotient: " + (double) num / denom);
        } catch (InputMismatchException e) {
            System.out.println("Error: must enter an int");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Handled that error handily.");
        }
    }
}
