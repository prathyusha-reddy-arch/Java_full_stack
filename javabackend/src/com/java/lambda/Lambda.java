package com.java.lambda;

import java.util.function.Consumer;

public class Lambda implements GenericPrinter {
    public static void main(String args[]){
        GenericPrinter gp= new GenericPrinter<Person>() {
            @Override
            public void print(Person person) {

            }
        };

        Person person=new Person();
        GenericPrinter lambda=(p)->System.out.println("in lambda");
        lambda.print(person);
    }


    @Override
    public void print(Object o) {

    }


    Consumer c= (er)->System.out.println(er.toString());

}
