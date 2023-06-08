package com.java.Strings06_08;

import java.util.Scanner;

public class StringsMain {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       String str=sc.next();

        //Finding count of vowel letters
       FindVowel fv=new FindVowel();
        System.out.println(fv.noOfVowels(str));

        //Checking for anagram
        Anagram a=new Anagram();
        String str1=sc.next();
        String str2=sc.next();
        System.out.println("Is Anagram " + a.isAnagram(str1,str2));

        //reversing words in a string
        StringReverse sr=new StringReverse();
        sr.stringRev("Java J2EE Reverse Me");

        //isrotation or not
        StringRotation ss=new StringRotation();
        System.out.println("Is rotation "+ss.isRotation("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee"));

    }
}
