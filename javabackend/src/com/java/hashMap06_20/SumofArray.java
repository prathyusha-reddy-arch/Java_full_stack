package com.java.hashMap06_20;
import java.util.HashMap;
public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int target = 100;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]+arr[j]==target)
                    hm.put(i,j);
        hm.forEach((k,v) -> System.out.println(k+" "+v));

    }
}
