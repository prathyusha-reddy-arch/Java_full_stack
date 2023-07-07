package com.java.springdemo.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceDemo {

    ArrayList<String> al = new ArrayList<String>();
    public ServiceDemo() {

        al.add("Prathyusha");
    }


    public ArrayList<String> getName() {
        return al;
    }

    public boolean setName(String name) {

        al=new ArrayList<>();
        return al.add(name);
    }

    public boolean putName(String name) {


       return al.add(name);
    }

    public boolean delName(String name) {

        return al.remove(name);
    }
}
