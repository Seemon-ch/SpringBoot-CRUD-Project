package com.webApp.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        return "WELCOME TO MY PAGE";
    }
    @RequestMapping("/about")
    public String about(){

    }
}
