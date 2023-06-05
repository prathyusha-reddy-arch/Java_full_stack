package com.javabackend;
import com.java.assn31.Student;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        //Student.java file assignment 1
        Student s= new Student();
        System.out.println("getname method "+s.getName());
        //SETTING THE NEW NAME
        String p_name = sc.next();
        s.setName(p_name);
        System.out.println(p_name);
        System.out.println("after setting new name setname method "+s.getName());
    }
}
