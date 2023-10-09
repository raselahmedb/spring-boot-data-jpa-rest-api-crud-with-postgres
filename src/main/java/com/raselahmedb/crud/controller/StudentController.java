package com.raselahmedb.crud.controller;

import com.raselahmedb.crud.models.Student;
import com.raselahmedb.crud.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudent()
    {
       return ResponseEntity.ok(studentService.fetchAllStudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id)
    {
        Student std = studentService.fetchStudentById(id).orElse(null);
        return ResponseEntity.ok(std);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        Student std = studentService.addStudent(student);
        return ResponseEntity.ok(std);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student)
    {
        Student std = studentService.updateStudent(student);
        return ResponseEntity.ok(std);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Delete Successful!");
    }
}
