package com.deepak.lecturers.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Lecturers")
@Data
@NoArgsConstructor
@SequenceGenerator(name = "displayIdSequence", initialValue = 1000, allocationSize = 1)
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "displayIdSequence")
    int id;
    String lecturerName;
    String lecturerAddr;

    @ManyToOne()
    private Department department;
    String email;
    String phone;

    @ManyToMany(mappedBy = "lecturerList")
    private List<Course> courseList = new ArrayList<>();
}
