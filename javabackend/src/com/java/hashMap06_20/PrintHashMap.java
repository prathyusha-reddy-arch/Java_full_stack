package com.java.hashMap06_20;

import com.java.getterSetter05_31.Student;

import java.util.HashMap;
import java.util.Iterator;

public class PrintHashMap {

    public static void main(String[] args) {

        HashMap<String, Student> student=new HashMap<String,Student>();
        student.put("david",new Student("david","tim", (float) 3.5f));
        student.put("roy",new Student("roy","raj",3.8f));
        student.put("james",new Student("james","smith",2.5f));
        student.put("john",new Student("john","davis",3.3f));
        student.put("steven",new Student("steven","johnson", (float) 3.2f));
        student.put("charles",new Student("charles","anderson", (float) 2.5f));
        student.put("daniel",new Student("daniel","brown", (float) 3.7f));
        student.put("henry",new Student("henry","wiiliams", (float) 3.5f));

        // 1. Using an iterator
        System.out.println("\n using keyset and iterator:");
        Iterator<String> itr = student.keySet().iterator();
        while (itr.hasNext()) {
           String key=itr.next();
           System.out.println(itr.next()+" "+student.get(key));
        }

        //2. Using for each
        System.out.println("\n using forEach method:");
        student.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value.getLname()+" "+value.getGpa()));

        //3.Using entry set
        System.out.println("\n HashMap Entries (using entrySet):");
         System.out.println("The set is: " + student.entrySet());




    }
}
