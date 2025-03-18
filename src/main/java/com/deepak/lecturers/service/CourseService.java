package com.deepak.lecturers.service;

import com.deepak.lecturers.model.Course;
import com.deepak.lecturers.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService{
    @Autowired
    public CourseRepository courseRepository;

    @Override
    public List<Course> getAllCoursesSvc() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseByIdSvc(int courseId) {
        return courseRepository.findById(courseId).get();
    }

    @Override
    public void addNewCourseSvc(Course course) {
        courseRepository.save(course);
    }

    @Override
    public Course updateCourseNameSvc(Course course) {
        Course updatedCourse = getCourseByIdSvc(course.getId());
        updatedCourse.setCourseName(course.getCourseName());
        courseRepository.save(updatedCourse);
        return updatedCourse;
    }

    @Override
    public void deleteCourseByIdSvc(int courseId) {
        courseRepository.deleteById(courseId);
    }
}
