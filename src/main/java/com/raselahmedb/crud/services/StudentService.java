package com.raselahmedb.crud.services;

import com.raselahmedb.crud.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student addStudent(Student student);
    List<Student> fetchAllStudent();
    Optional<Student> fetchStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
