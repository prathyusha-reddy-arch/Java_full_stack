package com.java.Collections06_20;

import com.java.getterSetter05_31.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StudentsaboveAvg {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>();
       l.add(new Student("david","tim",3.5f));
        l.add(new Student("roy","raj",3.8f));
        l.add(new Student("james","smith",2.5f));
        l.add(new Student("john","davis",3.3f));

        double sumGpa = l.stream()
                .mapToDouble(Student::getGpa)
                .sum();
        double avg=sumGpa/l.size();
       List<Student> newList= l.stream()
               .filter(i->i.getGpa()<avg)
               .collect(Collectors.toList());
       for(int i=0;i<newList.size();i++){
           l.remove(newList.get(i));
       }
       System.out.println("Average is "+avg);
       for(Student student:l)
           System.out.println(student.getFname()+" "+student.getLname()+" "+student.getGpa()+" ");


    }
}

