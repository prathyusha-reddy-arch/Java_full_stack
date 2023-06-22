package com.java.hashMap06_20;

import java.util.HashMap;

public class StrLetterCount {

    public static void main(String[] args) {
        String str= "test string";
        String temp="";


        HashMap<Character,Integer> map= new HashMap<>(str.length());
        int count;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++) {
            count=0;
            if(97<=str.charAt(i) && str.charAt(i)<=122)  //considers only alphabets[a-z]
                if(!map.containsKey( str.charAt(i))) {
                    for (int j = i + 1; j < str.length(); j++)
                        if (str.charAt(i) == str.charAt(j))
                            count++;
                    map.put(str.charAt(i), count + 1);
                }

        }
        map.forEach((k,v) -> System.out.println(k+"-"+v));


    }

}
