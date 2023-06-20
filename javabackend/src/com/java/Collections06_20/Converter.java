package com.java.Collections06_20;

import java.util.ArrayList;

public class Converter {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<5;i++ ){
            al.add(i);
        }

        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
         // int[] arr = al.stream().mapToInt(i -> i).toArray();

            System.out.print("Converted into array ?"+arr.getClass().isArray());
    }
}
