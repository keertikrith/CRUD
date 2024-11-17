package com.example.CRUDSQL90.Repository;

import com.example.CRUDSQL90.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
