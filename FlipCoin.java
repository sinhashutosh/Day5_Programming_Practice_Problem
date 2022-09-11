package org.example;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int head = 0;
        int tail = 0;
        System.out.println("How Many time you want to Flip coins..");
        int times = sc.nextInt();
        if (times <= 0) {
            System.out.println("Value Can not be Negative");
            System.out.println(" Please Enter Any Positive Number to Flip coins..");
            times = sc.nextInt();
        }
        for (int i = 0; i < times; i++) {
            int temp = rd.nextInt(2);
            //System.out.println(temp);
            if (temp == 0) {
                head++;
            } else {
                tail++;
            }
        }
        System.out.println("============================");
        System.out.println(head);
        float head_per = ((head * 100) / times);
        System.out.println("Percentage of HEAD comes = "+head_per+"%");
        System.out.println("============================");
        System.out.println(tail);
        float tail_per = ((tail * 100) / times);
        System.out.println("Percentage of TAIL comes = "+tail_per+"%");
    }
}
