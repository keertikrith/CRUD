package com.example.CRUDSQL90.Service;

import com.example.CRUDSQL90.Entity.Student;
import com.example.CRUDSQL90.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//adding comments
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }


    public List<Student> getAll() {
        return studentRepo.findAll();

    }
}
