package com.secure.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi";
    }
}
