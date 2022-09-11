package org.example;

import java.util.Scanner;

public class HarmonicNumber {
    static float sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth Term of harmonic Series");
        int n = sc.nextByte();
        while (n == 0) {
            System.out.println("Nth term cannot be zero");
            System.out.println("Enter Nth Term of harmonic Series again ");
            n = sc.nextInt();
        }
        System.out.println(n);

        for (float i = 1; i <= (float) n; i++) {
            sum += (1 / i);

        }
        System.out.println(sum);
    }
}
