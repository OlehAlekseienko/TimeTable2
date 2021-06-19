package com.example.timetable.controller.ui;

import com.example.timetable.form.RoomForm;
import com.example.timetable.model.Classroom;
import com.example.timetable.services.classroom.ClassroomService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/delete/{id}")
    String delete(Model model, @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }

    @RequestMapping("/ReNew")
    String reNew(Model model ){
        System.out.println("hi");
        service.reNew();
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }
    @GetMapping("/create")
    String create(Model model){
        RoomForm roomForm = new RoomForm();
        model.addAttribute("form" , roomForm );
        return "createroom";
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model,
                  RoomForm form){
        System.out.println("hello");
        Classroom classroom = new Classroom();
        classroom.setName(form.getName());
        classroom.setCapacity(form.getCapacity());
        service.create(classroom);
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
        }

    @GetMapping("/update/{id}")
    String update(Model model, @PathVariable("id") String id){
        Classroom classroom = service.get(id);
        RoomForm roomForm = new RoomForm();
        roomForm.setId(classroom.getId());
        roomForm.setName(classroom.getName());
        roomForm.setCapacity(classroom.getCapacity());
        model.addAttribute("form" , roomForm );
        return "update";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    String update(Model model,
                  RoomForm form){
        System.out.println("hello");
        Classroom classroom = new Classroom();
        classroom.setName(form.getName());
        classroom.setCapacity(form.getCapacity());
        classroom.setId(form.getId());
        service.update(classroom);
        model.addAttribute("rooms",service.getAll());
        return "classrooms";
    }
}
