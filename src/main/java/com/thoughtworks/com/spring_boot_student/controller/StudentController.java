package com.thoughtworks.com.spring_boot_student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public
class StudentController {
    @GetMapping("/")
    public
    String sayHello() {
        return "Hello Megha !!!";
    }

    @GetMapping("/hello")
    public
    String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " !!!";
    }

}
