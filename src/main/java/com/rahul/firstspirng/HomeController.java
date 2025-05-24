package com.rahul.firstspirng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    //we will see the index.html view to be displayed at the / path
    public String index(){
        return "index.html";   //this is the view we return when we reach / 
    }
}
