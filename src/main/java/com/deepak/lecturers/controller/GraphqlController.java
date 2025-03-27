package com.deepak.lecturers.controller;

import com.deepak.lecturers.model.Course;
import com.deepak.lecturers.model.Department;
import com.deepak.lecturers.model.Lecturer;
import com.deepak.lecturers.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Set;

@Controller
public class GraphqlController {
    @Autowired
    LecturerService lecturerService;

    @QueryMapping
    public List<Lecturer> getAllLecturers(){
        return lecturerService.getAllLecturersSvc();
    }

    @QueryMapping
    public Lecturer getLecturerById(@Argument Integer id){
        return lecturerService.getLecturerByIdSvc(id);
    }

    @MutationMapping
    public Lecturer saveLecturer(@Argument String lecturerName,
                                 @Argument String lecturerAddr,
                                 @Argument String email,
                                 @Argument String phone,
                                 @Argument Set<Department> departments,
                                 @Argument Set<Course> courses){
        Lecturer newLecturer = new Lecturer();
        newLecturer.setLecturerName(lecturerName);
        newLecturer.setLecturerAddr(lecturerAddr);
        newLecturer.setEmail(email);
        newLecturer.setPhone(phone);
        newLecturer.setDepartments(departments);
        newLecturer.setCourses(courses);
        return lecturerService.saveLecturerSvc(newLecturer);
    }

    @MutationMapping
    public Lecturer updateLecturer(@Argument Integer id,
                                   @Argument String lecturerName,
                                   @Argument String lecturerAddr,
                                   @Argument String email,
                                   @Argument String phone,
                                   @Argument Set<Department> departments,
                                   @Argument Set<Course> courses){
        Lecturer updatedLecturer = new Lecturer();
        updatedLecturer.setId(id);
        updatedLecturer.setLecturerName(lecturerName);
        updatedLecturer.setLecturerAddr(lecturerAddr);
        updatedLecturer.setEmail(email);
        updatedLecturer.setPhone(phone);
        updatedLecturer.setDepartments(departments);
        updatedLecturer.setCourses(courses);
        return lecturerService.updateLecturerSvc(updatedLecturer);
    }

    @MutationMapping
    public Boolean deleteLecturerById(@Argument Integer id){
        return lecturerService.deleteLecturerByIdSvc(id);
    }

    @QueryMapping
    public List<Lecturer> getLecturersByDepartment(@Argument Department department){
        return lecturerService.getLecturersByDepartmentSvc(department);
    }

    @QueryMapping
    public List<Lecturer> getLecturersByCourse(@Argument Course course){
        return lecturerService.getLecturersByCourseSvc(course);
    }
}
