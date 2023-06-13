package com.java.Exceptions06_12;

import org.omg.SendingContext.RunTime;

public class CustomExceptionClass extends ArithmeticException{

    public  CustomExceptionClass(){}

    public  CustomExceptionClass(String errorMessage){
        super(errorMessage);
    }

    public void divideByZero(){
        int i=0;
        try {
            int x = 25 / i;
            System.out.println("value of x" + x);

        }catch(ArithmeticException e)
        {
            System.out.println(e);
            throw new CustomExceptionClass("ArithmeticException class");
        }

    }

    public static void main(String args[]) throws Exception {

        CustomExceptionClass c=new CustomExceptionClass();
            try{
                c.divideByZero();
            }
            catch(CustomExceptionClass e){
                throw new CustomExceptionClass("NumberFormatException class");
            }
    }

}
