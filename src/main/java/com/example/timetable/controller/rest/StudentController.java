package com.example.timetable.controller.rest;

import com.example.timetable.model.Student;
import com.example.timetable.services.group.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    GroupService service;

    private List<Student> students;


    @PostConstruct
    void init(){
        students = new ArrayList<>(
                     Arrays.asList(
                             new Student("1" , "Gio" , null),
                         new Student("2" , "Lox" , service.getGroupById("2")),
                        new Student("3" , "Pampers" , service.getGroupById("3")),
                       new Student("4" , "P@blo" , service.getGroupById("1"))
               )
        );
    }

    @RequestMapping("/dauns")
    List<Student> getAll(){
        return students;
    }
}
