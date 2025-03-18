package com.deepak.lecturers.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Courses")
@Data
@NoArgsConstructor
@SequenceGenerator(name = "displayIdSequence", initialValue = 1000, allocationSize = 1)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "displayIdSequence")
    int id;
    String courseName;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Lecturer> lecturerList = new ArrayList<>();
}
