package com.example.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Classroom {
    private String id;
    private String name;
    private Integer capacity;

    public Classroom(String id, String name, Integer capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
}
