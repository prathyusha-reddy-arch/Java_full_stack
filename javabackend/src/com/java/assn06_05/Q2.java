package com.java.assn06_05;

import java.util.Scanner;

public class Q2 {
    int age;
    public void personAge(int age){
        this.age=age;
        if(age>0) {
            if (age < 13)
                System.out.println("Kid");
            else if (age >= 13 && age <= 19)
                System.out.println("teen");
            else
                System.out.println("adult");
        }else
            System.out.println("Invalid age");
    }
    public static void main(String[] args){
        Q2 q=new Q2();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        int x=sc.nextInt();
        q.personAge(x);
    }
}
