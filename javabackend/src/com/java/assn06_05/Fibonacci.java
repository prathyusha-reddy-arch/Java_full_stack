package com.java.assn06_05;

public class Fibonacci {
  int f1,f2,f3;
    public void fibonacci(int x){
       f1=0;
       f2=1;
        //System.out.print(f1 +" ");
        for(int i=0;i<x-1;i++){
           f3=f2+f1;
            System.out.print(f1 +" ");
           f2=f1;
           f1=f3;

        }
    }
    public static void main(String[] args){
        Fibonacci q=new Fibonacci();
       // Scanner sc=new Scanner(System.in);
        q.fibonacci(10);
    }
}
