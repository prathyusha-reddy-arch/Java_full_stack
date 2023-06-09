package com.java.loopstatements06_05;

import java.util.Scanner;

public class Reverse {
    public void reverse(int reverse) {
        int x = reverse;
        int y = 0;
        int rev = 0;
        if (x % 10 == 0) {
            String str = "" + x;
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());

        } else {
            while (x != 0) {
                int rem = x % 10;
                rev = rev * 10 + rem;
                x = x / 10;
            }
            System.out.println(rev);

        }
    }
    public static void main(String[] args){
       Reverse q=new Reverse();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
        q.reverse(sc.nextInt());
    }
}
