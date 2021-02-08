package com.event.analisis.service.implementation;

import com.event.analisis.model.Student;
import com.event.analisis.repository.StudentRepository;
import com.event.analisis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentServiceImplementation implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentsById(String idStudent) {
        return studentRepository.findById(idStudent);
    }

    @Override
    public String saveStudents(Student student) {
        studentRepository.save(student);
        return "Student was saved";
    }

    @Override
    public String deleteStudents(Student student) {
        studentRepository.delete(student);
        return "Student was delete";
    }
}
