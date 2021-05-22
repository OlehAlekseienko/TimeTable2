package com.example.timetable.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/hello")
String sayHello (){
    return "<h2 style=\"color: aqua\">Hell0</h2>" +
            "<h2 style=\"color: aqua\">H3ll0</h2>" +
            "<h2 style=\"color: aqua\">H3110</h2>";
}
}
