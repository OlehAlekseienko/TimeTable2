package com.example.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Checia {
    private String id;
    private String name;
    private String lesson;

    public Checia(String id, String name, String lesson) {
        this.id = id;
        this.name = name;
        this.lesson = lesson;
    }

    public Checia() {
    }
}
