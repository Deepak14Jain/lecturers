package com.deepak.lecturers.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "Lecturers")
@Data
@NoArgsConstructor
@SequenceGenerator(name = "displayIdSequence", initialValue = 1000, allocationSize = 1)
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "displayIdSequence")
    Integer id;
    String lecturerName;
    String lecturerAddr;
    String email;
    String phone;

    @ElementCollection(targetClass = Department.class)
    @Enumerated(EnumType.STRING)
    private Set<Department> departments;

    @ElementCollection(targetClass = Course.class)
    @Enumerated(EnumType.STRING)
    private Set<Course> courses;
}
