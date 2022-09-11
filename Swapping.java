package org.example;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the First Number: ");
        int number2 = sc.nextInt();
        System.out.println(" Entered Number are Number1= "+number1+" Number2= "+number2);
        number1+=number2;
        number2=number1-number2;
        number1=number1-number2;
        System.out.println("Number after swapping are ");
        System.out.println("Number1= "+number1+" Number2= "+number2);

    }
}
