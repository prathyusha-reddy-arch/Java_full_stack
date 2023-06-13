package com.java.strings06_08;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class IOoperations   {

    public void readCSV() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E:\\Practice\\Backend\\Java_full_stack\\javabackend\\src\\com\\java\\strings06_08\\student.csv"));


        String line;

        Student1[] stu = new Student1[10];
        for(int i=1;sc.hasNextLine();i++){
            line= sc.nextLine();
            String[] arr = line.split(",");
            //for(int j=0;j< arr.length;j++)

            System.out.println(arr[0]);
            String firstName = arr[0];
            System.out.println(arr[1]);
            String lastName = arr[1];
            System.out.println(arr[2]);
            Float gpa = Float.valueOf(arr[2]);
            stu[i]= new Student1(firstName, lastName, gpa);

        }


        Arrays.sort(stu);

        for (Student1 s2:
                stu) {
            System.out.println(s2);
        }


    }
}
