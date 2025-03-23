package com.deepak.lecturers.controller;

import com.deepak.lecturers.model.Course;
import com.deepak.lecturers.model.Department;
import com.deepak.lecturers.model.Lecturer;
import com.deepak.lecturers.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lecturers")
public class LecturerController {
    @Autowired
    LecturerService lecturerService;

    @GetMapping("/getAllLecturers")
    public List<Lecturer> getAllLecturers(){
        return lecturerService.getAllLecturersSvc();
    }

    @GetMapping("/getLecturerById/{lecturerId}")
    public Lecturer getLecturerById(@PathVariable int lecturerId){
        return lecturerService.getLecturerByIdSvc(lecturerId);
    }

    @PostMapping("/saveLecturer")
    public Lecturer saveLecturer(@RequestBody Lecturer lecturer){
        return lecturerService.saveLecturerSvc(lecturer);
    }

    @PutMapping("/updateLecturer")
    public Lecturer updateLecturer(@RequestBody Lecturer lecturer){
        return lecturerService.updateLecturerSvc(lecturer);
    }

    @DeleteMapping("/deleteLecturerById/{lecturerId}")
    public void deleteLecturerById(@PathVariable int lecturerId){
        lecturerService.deleteLecturerByIdSvc(lecturerId);
    }

    @GetMapping("/getLecturerByDepartment")
    public List<Lecturer> getLecturersByDepartment(@RequestParam Department department){
        return lecturerService.getLecturersByDepartmentSvc(department);
    }

    @GetMapping("/getLecturerByCourse")
    public List<Lecturer> getLecturersByCourse(@RequestParam Course course){
        return lecturerService.getLecturersByCourseSvc(course);
    }
}
