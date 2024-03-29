package com.example.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Classroom {
    private String id;
    private String name;
    private Integer capacity;

    public Classroom(String id, String name, Integer capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    public Classroom() {
    }

    @Override
    public String toString() {
        return "Classroom{}";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
