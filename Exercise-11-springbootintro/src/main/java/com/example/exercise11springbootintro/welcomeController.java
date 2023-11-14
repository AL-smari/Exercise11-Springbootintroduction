package com.example.exercise11springbootintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/name")
    public String name(){
        return "My name is abdulaziz";

    }
    @GetMapping("/age")
    public String age(){
        return "My age is 23";

    }
    @GetMapping("/check/status")
    public String status(){
        return "Everything OK";

    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";

    }
    @GetMapping("/names")
    public String[] names(){
        String [] s = {"abdulaziz","khalid","ahmad","faisal"};

        return s;


    }

}

