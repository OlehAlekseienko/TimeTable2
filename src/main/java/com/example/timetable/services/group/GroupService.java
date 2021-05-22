package com.example.timetable.services.group;

import com.example.timetable.model.Checia;
import com.example.timetable.model.Group;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GroupService {
    private List<Group> groups = new ArrayList<>(
            Arrays.asList(
                    new Group("1" , "Jirniy" ) ,
                    new Group("2" , "Shizoidka") ,
                    new Group("3" , "THEBEST") ,
                    new Group("4" , "50/50") ,
                    new Group("5" , "Demon")
            ));

    public List<Group> getGroups() {
        return groups;
    }
    public Group getGroupById(String id) {
        System.out.println(groups.get(0));
        return groups.get(0);
    }
}
