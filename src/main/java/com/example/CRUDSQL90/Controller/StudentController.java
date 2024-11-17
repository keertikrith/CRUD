package com.example.CRUDSQL90.Controller;

import com.example.CRUDSQL90.Entity.Student;
import com.example.CRUDSQL90.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){
        return studentService.saveDetails(student);
    }
    @GetMapping("/getStudent")
    public List<Student> getDetails(Student student){
        return studentService.getAll();
    }
}
