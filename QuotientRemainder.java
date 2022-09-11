package org.example;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Positive number for Dividend ");
        int divident = sc.nextInt();
        System.out.println("Enter the Positive number for Divisor ");
        int divisor = sc.nextInt();
        while (divisor<=0) {
            System.out.println("Number cannot be  less than or equal to Zero(0)");
            System.out.println("Enter Any Natural Number  Again ");
            divisor = sc.nextInt();
        }
        int remainder = divident % divisor;
        int quotient = divident / divisor;
        System.out.println(" Quotient = "+quotient+" Remainder = "+remainder);
    }
}


