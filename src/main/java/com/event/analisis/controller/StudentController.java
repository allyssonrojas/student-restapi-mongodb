package com.event.analisis.controller;

import com.event.analisis.model.Student;
import com.event.analisis.service.implementation.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    StudentServiceImplementation studentServiceImplementation;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentServiceImplementation.getAllStudents();
    }

    @GetMapping("/{idStudent}")
    public Optional<Student> getStudentsById(@PathVariable String idStudent){
        return studentServiceImplementation.getStudentsById(idStudent);
    }

    @PostMapping
    public String saveStudents(@RequestBody Student student){
        return studentServiceImplementation.saveStudents(student);
    }

    @DeleteMapping
    public String deleteStudents(@RequestBody Student student){
        return studentServiceImplementation.deleteStudents(student);
    }





}
