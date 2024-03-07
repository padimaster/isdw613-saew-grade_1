package com.saew.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saew.dto.Student;
import com.saew.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentsController {
    
    private StudentService studentService;

    public StudentsController() {
        this.studentService = new StudentService();
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok().body(studentService.getAllStudents());
    }
    
    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudentByName(@RequestParam(name = "name") String name) {    
        return ResponseEntity.ok().body(studentService.getStudentByName(name));
    }
       
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(studentService.getStudentById(id));
    }

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok().body(studentService.createStudent(student));
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") String id, @RequestBody Student student) {
        return ResponseEntity.ok().body(studentService.updateStudent(student));
    }
    
    @DeleteMapping("/student/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable("id") String id, @RequestBody Student student) {
        return ResponseEntity.ok().body(studentService.deleteStudent(id));
    }

    

    
}
