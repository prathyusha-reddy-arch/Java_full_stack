package com.java.Lambda_Streams06_16;

import java.util.Arrays;

public class Capitalize {

    public static void main(String[] args) {
        String[] strArray={"hi","hello","how are ","you","amul"};
        String [] str=Arrays.stream(strArray)
                .sorted()
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .toArray(String[]::new);
                //.forEach(System.out::println);
        for (String str1: str) {
           System.out.println(str1);
        }


    }
}
