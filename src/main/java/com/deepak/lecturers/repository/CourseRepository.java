package com.deepak.lecturers.repository;

import com.deepak.lecturers.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository <Course, Integer> {
}
