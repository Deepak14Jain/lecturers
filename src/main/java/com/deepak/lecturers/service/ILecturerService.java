package com.deepak.lecturers.service;

import com.deepak.lecturers.model.Course;
import com.deepak.lecturers.model.Department;
import com.deepak.lecturers.model.Lecturer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ILecturerService {
    public List<Lecturer> getAllLecturersSvc();
    public Lecturer getLecturerByIdSvc(Integer lecturerId);
    public Lecturer saveLecturerSvc(Lecturer lecturer);
    public Lecturer updateLecturerSvc(Lecturer lecturer);
    public Boolean deleteLecturerByIdSvc(Integer lecturerId);
    public List<Lecturer> getLecturersByDepartmentSvc(Department department);
    public List<Lecturer> getLecturersByCourseSvc(Course course);
}
