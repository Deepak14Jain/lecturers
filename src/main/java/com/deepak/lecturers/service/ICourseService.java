package com.deepak.lecturers.service;

import com.deepak.lecturers.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICourseService {
    public List<Course> getAllCoursesSvc();
    public Course getCourseByIdSvc(int courseId);
    public void addNewCourseSvc(Course course);
    public Course updateCourseNameSvc(Course course);
    public void deleteCourseByIdSvc(int courseId);
}
