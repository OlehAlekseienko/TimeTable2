package com.example.timetable.controller.ui;

import com.example.timetable.model.Classroom;
import com.example.timetable.services.classroom.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/ui/rooms")
public class ClassroomWebUIController {

    @Autowired
    ClassroomService service;

    @RequestMapping()
    String getAll(Model model){
        System.out.println("Pampers");
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }
}
