package com.java.strings06_08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOoperations {

    public void readCSV() throws FileNotFoundException {
        Scanner sc=new Scanner(new File("E:\\Practice\\Backend\\Java_full_stack\\javabackend\\src\\com\\java\\strings06_08\\student.csv"));

       sc.useDelimiter(",");
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next()+" ");  //find and returns the next complete token from this scanner
        }
        sc.close();
    }
}
