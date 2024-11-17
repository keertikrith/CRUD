package com.example.CRUDSQL90.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Student_db")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private int ID;
    @Column(name="marks")
    private int marks;
    @Column(name="Student_name")
    private String sname;


}
