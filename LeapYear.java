package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check Leap year from 1000");
        int year = sc.nextInt();
        while (year < 1000) {
            System.out.println("Year Can not be Lower than 1000 ");
            System.out.println("Enter the year AGAIN to check Leap year from 1000");
            year = sc.nextInt();
        }
        System.out.println("================================");
        if (year % 100 == 0 && year % 400 == 0 ) {
            System.out.println(year + " is Leap Year");
        } else if (year % 100 != 0 && year % 4==0){
            System.out.println(year + " is Leap  Year");
        }
        else {
            System.out.println(year + " is Leap NOT Year");
        }
    }
}
