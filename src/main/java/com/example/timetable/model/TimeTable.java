package com.example.timetable.model;

import lombok.Data;

@Data
public class TimeTable {
    private String id;
    private Classroom classroom;
    private Checia checia;
    private Group group;
}
