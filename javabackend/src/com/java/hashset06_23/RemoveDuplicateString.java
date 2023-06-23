package com.java.hashset06_23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> hset=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
            hset.add(str.charAt(i));
        System.out.println(hset);
    }


}
