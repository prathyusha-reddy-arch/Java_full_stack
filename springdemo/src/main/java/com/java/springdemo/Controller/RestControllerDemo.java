package com.java.springdemo.Controller;

import com.java.springdemo.Service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import  com.java.springdemo.model.ModelDemo;
import java.util.ArrayList;

@RestController

public class RestControllerDemo {

    @Autowired
    private ServiceDemo demoService;


    @RequestMapping(value="/getName" ,method= RequestMethod.GET)
    public ResponseEntity<ArrayList<String>> getName(){

        return new ResponseEntity<>(demoService.getName(), HttpStatus.CREATED);
    }

    @RequestMapping(value="/postName",method=RequestMethod.POST)

    public boolean postName(ModelDemo m){

        return demoService.setName(m.getName());
    }

    @RequestMapping(value="/putName" ,method= RequestMethod.PUT)
    public boolean putName(ModelDemo m){

        return demoService.putName(m.getName());
    }

    @RequestMapping(value="/deleteName" ,method= RequestMethod.DELETE)
    public boolean delName(String name){

        return demoService.delName(name);
    }

}
