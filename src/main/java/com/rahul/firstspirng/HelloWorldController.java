package com.rahul.firstspirng;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    

//creating a get request at /hello

@GetMapping(path = "/hello")
public String helloWorld(){
    return "Hello gooyz"; 
}
    
}
