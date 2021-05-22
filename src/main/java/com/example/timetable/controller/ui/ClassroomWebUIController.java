package com.example.timetable.controller.ui;

import com.example.timetable.model.Classroom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ClassroomWebUIController {
    private List<Classroom> classrooms = new ArrayList<>(
            Arrays.asList(
                    new Classroom("1", "SportZall", 200),
                    new Classroom("2", "Kabinet Shiziki", 32),
                    new Classroom("3", "Labaratory", 50),
                    new Classroom("4", "Dior", 9999),
                    new Classroom("5", "TUALET", 3),
                    new Classroom("6", "Mmelogy", 666)
            )
    );
    @RequestMapping("/ui/crooms")
    String getAll(Model model){
        System.out.println("Pampers");
        model.addAttribute("rooms",classrooms);
        return "classrooms";
    }
}
