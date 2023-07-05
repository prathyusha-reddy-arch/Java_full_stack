package com.java.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    @Autowired
    Address add;
    @Autowired
    Account acc;

}
