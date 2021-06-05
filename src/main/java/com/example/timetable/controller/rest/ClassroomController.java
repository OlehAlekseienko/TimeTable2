package com.example.timetable.controller.rest;

import com.example.timetable.model.Classroom;
import com.example.timetable.services.classroom.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/api/rooms")
public class ClassroomController {

    @Autowired
    ClassroomService service;

    @RequestMapping()
    List<Classroom> getAll() {
        return service.getAll();
    }
@PostMapping()
    Classroom create(Classroom classroom) {
        return null;
    }
@GetMapping("/{id}")
    Classroom get(String id) {
        return null;
    }
@PutMapping()
    Classroom update(Classroom classroom) {
        return null;
    }
    @DeleteMapping("/{id}")
    Classroom delete(String id) {
        return null;
    }
}