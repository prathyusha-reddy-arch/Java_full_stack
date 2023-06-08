package com.java.Strings06_08;

public class Anagram {
    public boolean isAnagram(String str1,String str2){
        int count1[]=new int[256];
        int count2[]=new int[256];
        if(str1.length()!=str2.length())
            return false;

            for(int i=0;i<str1.length();i++){
                count1[str1.charAt(i)]++;
                count2[str2.charAt(i)]++;
            }


        for(int i=0;i<count1.length;i++){
            if(count1[i]!=count2[i])
                return false;

        }
        return true;




    }
}
