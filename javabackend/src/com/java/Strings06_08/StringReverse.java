package com.java.Strings06_08;

import java.util.Arrays;

public class StringReverse {

    public void stringRev(String str){

        String newString[];
        newString=str.split(" ");
        String finalString="";

      for(int i=0;i<newString.length;i++){

        finalString+= reverse(newString[i])+" ";
      }
      System.out.println(finalString);

    }

    public String reverse(String str){

      char c[]=str.toCharArray();

      int i=0;
      char temp=' ';



            for(int j=0;j< c.length-1;j++){
                temp=c[j];
                c[j]=c[j+1];
                c[j+1]=temp;


            }

        String string=new String(c);

        return string;
    }


}
