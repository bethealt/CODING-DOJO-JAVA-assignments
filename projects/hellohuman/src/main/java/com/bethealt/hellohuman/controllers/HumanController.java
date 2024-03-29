package com.bethealt.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HumanController {
    @RequestMapping("/")
    public String index(
        @RequestParam(value="name", required=false) String firstName,
        @RequestParam(value="last_name", required=false) String lastName
        ) {
        if (firstName == null) {
            return "Hello Human";
        }
        else if (lastName == null) {
            return "Hello" + firstName;
        }
        else{
        return "Hello " + firstName+ " " + lastName; 
        }
    }
    
}
