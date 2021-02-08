package com.event.analisis.service;

import com.event.analisis.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();
    Optional<Student>getStudentsById(String idStudent);
    String saveStudents(Student student);
    String deleteStudents(Student student);
}
