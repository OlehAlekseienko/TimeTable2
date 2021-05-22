package com.example.timetable.controller.rest;

import com.example.timetable.model.Checia;
import com.example.timetable.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ChehciaController {
        private List<Checia> checias = new ArrayList<>(
                Arrays.asList(
                        new Checia("1" , "Jirniy" , "fizruck" ) ,
                        new Checia("2" , "Shizoidka" , "Shizika" ) ,
                        new Checia("3" , "THEBEST" , "Matemat" ) ,
                        new Checia("4" , "50/50" , "Ximia" ) ,
                        new Checia("5" , "Demon" , "Ukr.m" )
                )
        );

        @RequestMapping("/demons")
        List<Checia> getAll(){
                return checias;
        }

}
