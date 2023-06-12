package com.java.strings06_08;

public class Student1 implements Comparable {
    String firstName;
    String lastName;
    float gpa;


    public Student1(String firstName, String lastName, float gpa) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.gpa=gpa;
    }

    @Override
    public int compareTo(Student1 o) {
        return (this.lastName).compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return this.firstName+"  " +this.lastName+"  " +this.gpa;
    }
}
