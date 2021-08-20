package com.biancl.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Value("${name}")
    private String name;

    @RequestMapping(method = RequestMethod.GET ,value="/")
    public String helloWorld(){
        return "Hello ,"+name;
    }

    @RequestMapping(method = RequestMethod.GET ,value="/plus")
    public double plus (@RequestParam double x, @RequestParam double y){
        return x+y;
    }

    @RequestMapping(method = RequestMethod.GET ,value="/minus")
    public double minus (@RequestParam double x, @RequestParam double y){
        return x-y;
    }



}