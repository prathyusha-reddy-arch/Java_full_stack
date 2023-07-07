package com.java.springdemo.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceDemo {

    ArrayList<String> al = new ArrayList<String>();
    public ServiceDemo() {

        al.add("Prathyusha");
    }


    public String getName() {
        return al.get(0);
    }

    public void setName(String name) {
        al.add(name);
    }

    public void putName(String name) {
        if(!al.contains(name))

        al.add(name);
    }

    public void delName(String name) {
        al.remove(name);
    }
}
