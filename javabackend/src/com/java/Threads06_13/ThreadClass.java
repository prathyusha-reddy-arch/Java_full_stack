package com.java.Threads06_13;

public class ThreadClass extends Thread {

    public void run(){
        System.out.println("Thread implementation by extending thread class");
        for(int i=1;i<=10;i++)
            System.out.print(i+" ");
        System.out.println();
    }

}
