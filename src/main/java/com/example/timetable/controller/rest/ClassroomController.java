package com.example.timetable.controller.rest;

import com.example.timetable.model.Classroom;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class ClassroomController {
    private List<Classroom> classrooms = new ArrayList<>(
            Arrays.asList(
                    new Classroom("1", "SportZall", 200),
                    new Classroom("2", "Kabinet Shiziki", 32),
                    new Classroom("3", "Labaratory", 50),
                    new Classroom("4", "Dvor", 9999),
                    new Classroom("5", "TUALET", 3),
                    new Classroom("6", "Mmelogy", 666)
            )
    );
    @RequestMapping("/cab")
    List<Classroom> getAll() {
        return classrooms;
    }
    }