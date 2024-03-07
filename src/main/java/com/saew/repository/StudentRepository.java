package com.saew.repository;

import com.saew.dto.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentRepository {
    private List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<Student>();
    }

    public List<Student> getAll() {
        return students;
    }

    public List<Student> getStudentByName(String name) {
        List<Student> studentsByName = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                studentsByName.add(student);
            }
        }
        return studentsByName;
    }

    public Student getStudentById(String id) {
        for (Student student : students) {
            if (student.getId() == Integer.parseInt(id)) {
                return student;
            }
        }
        return null;
    }

    public Student createStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                return student;
            }
        }
        return null;
    }

    public Student deleteStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == Integer.parseInt(id)) {
                return students.remove(i);
            }
        }
        return null;
    }
}
