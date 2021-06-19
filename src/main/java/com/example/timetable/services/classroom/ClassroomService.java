package com.example.timetable.services.classroom;

import com.example.timetable.model.Classroom;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ClassroomService {
    private List<Classroom> classrooms;
    private List<Classroom> classrooms2;

    @PostConstruct
    void init(){
        classrooms = new ArrayList<>(
                Arrays.asList(
                        new Classroom("1", "SportZall", 200),
                        new Classroom("2", "Kabinet Shiziki", 32),
                        new Classroom("3", "Labaratory", 50),
                        new Classroom("4", "Dvor", 9999),
                        new Classroom("5", "TUALET", 3),
                        new Classroom("6", "Mmelogy", 666)
                )
        );
        classrooms2 = classrooms;
    }

    public List<Classroom> getAll() {
        return classrooms;
    }

    public void reNew(){
        classrooms = classrooms2;
        System.out.println(classrooms.size());
        System.out.println(classrooms2.size());
    }

    public void delete(String id) {
        classrooms = classrooms.stream().filter(room->!room.getId().equals(id))
                .collect(Collectors.toList());
    }

    public void create(Classroom classroom) {
        String id = UUID.randomUUID().toString();
        classroom.setId(id);
        classrooms.add(classroom);
    }
}
