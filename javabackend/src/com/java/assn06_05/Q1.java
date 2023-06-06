package com.java.assn06_05;

public class Q1 {
    public int reverse() {
        int x = 100;
        int y = 0;
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        System.out.println(rev);
        return rev;
    }
    public static void main(String[] args){
       Q1 q=new Q1();
        q.reverse();
    }
}
