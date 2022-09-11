package org.example;

import java.util.Scanner;

public class TableofPower2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the of power of 2 from (0-31)");
        int n = sc.nextInt();
        while (n <= 0 || n >= 31) {
            System.out.println("power Can not be Lower than 0 and greater than 31 ");
            System.out.println("Enter the power AGAIN to generate  the for table ");
            n = sc.nextInt();
        }
        System.out.println("=======================================");
        System.out.println("Table of Power of 2 ");
        for (int i = 0; i < n; i++) {
            System.out.println((int)Math.pow(2,i));

        }
    }
}
