package com.java.springdemo.Controller;

import com.java.springdemo.Service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ArrayList<String> getName(){
      return demoService.getName();
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
