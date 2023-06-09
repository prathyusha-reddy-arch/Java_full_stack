package com.java.inheritance06_02;

public class Child extends Parent{
    int id2;

    public Child(){
        this.id2=12;
        super.id1=45;
    }
   public Child(int x){
        this.id2=x;
   }
  // System.out.println("id2");



}
