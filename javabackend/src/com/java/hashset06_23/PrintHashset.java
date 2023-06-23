package com.java.hashset06_23;

import java.util.HashSet;
import java.util.Iterator;

public class PrintHashset {
    public static void main(String[] args) {
        HashSet<String> hset=new HashSet<String>();
        hset.add("Hi");
        hset.add("Hello");
        hset.add("How are you");
        hset.add("Hey");
        hset.add("World");
        hset.add("Implementing");
        hset.add("Hashset");
        hset.add("in");
        hset.add("java");
        hset.add("collections");

        //implmenting using iterator
        System.out.println("Implementing using iterator");
        Iterator i=hset.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        System.out.println("--------------------------");
        //implementing using foreach
        System.out.println("Implementing using foreach");
        hset.forEach(System.out::println);

        System.out.println("--------------------------");
        //implementing using streams foreach
        System.out.println("Implementing using  streams foreach");
        hset.stream().forEach(System.out::println);
    }
}
