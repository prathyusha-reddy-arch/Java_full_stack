package com.java.springdemo.Controller;

import com.java.springdemo.Service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

    @Autowired
    private ServiceDemo demoService;


    @RequestMapping(value="/getName" ,method= RequestMethod.GET)
    public String getName(){
      return demoService.getName();
    }

    @RequestMapping(value="/postName",method=RequestMethod.POST)
    public void setName(String name){
       demoService.setName(name);
    }

    @RequestMapping(value="/putName" ,method= RequestMethod.PUT)
    public void putName(String name){
        demoService.putName(name);
    }

    @RequestMapping(value="/deleteName" ,method= RequestMethod.DELETE)
    public void delName(String name){
        demoService.delName(name);
    }

}
