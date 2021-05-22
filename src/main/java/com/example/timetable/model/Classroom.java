package com.example.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Classroom {
    private String id;
    private String name;
    private Integer capacity;

}
