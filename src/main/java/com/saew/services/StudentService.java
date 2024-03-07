package com.saew.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saew.dto.Student;
import com.saew.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.getAll();
    }

    public List<Student> getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }

    public Student getStudentById(String id) {
        return studentRepository.getStudentById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.createStudent(student);
    }

    public Student updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    public Student deleteStudent(String id) {
        return studentRepository.deleteStudent(id);
    }
}
