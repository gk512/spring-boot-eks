package com.app.Student.controller;

import com.app.Student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    @GetMapping("/")
    public List<Student> getAllStudents(){
        List<Student> list= new ArrayList<>();
        list.add(new Student(1,"Gopi",85));
        list.add(new Student(2,"Krishna",84));
        list.add(new Student(3,"Chinni",98));
        list.add(new Student(4,"Guru",45));
        list.add(new Student(5,"Vasu",78));
        list.add(new Student(6,"Yogi",87));
        list.add(new Student(7,"NK",75));
        list.add(new Student(8,"Kusuma",63));

        return list;

    }
}
