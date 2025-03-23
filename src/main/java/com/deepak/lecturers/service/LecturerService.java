package com.deepak.lecturers.service;

import com.deepak.lecturers.model.Course;
import com.deepak.lecturers.model.Department;
import com.deepak.lecturers.model.Lecturer;
import com.deepak.lecturers.repository.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerService implements ILecturerService{
    @Autowired
    LecturerRepository lecturerRepository;

    @Override
    public List<Lecturer> getAllLecturersSvc() {
        return lecturerRepository.findAll();
    }

    @Override
    public Lecturer getLecturerByIdSvc(int lecturerId) {
        return lecturerRepository.findById(lecturerId).get();
    }

    @Override
    public Lecturer saveLecturerSvc(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

    @Override
    public Lecturer updateLecturerSvc(Lecturer lecturer) {
        Lecturer updatedLecturer = getLecturerByIdSvc(lecturer.getId());
        updatedLecturer.setLecturerName(lecturer.getLecturerName());
        updatedLecturer.setLecturerAddr(lecturer.getLecturerAddr());
        updatedLecturer.setEmail(lecturer.getEmail());
        updatedLecturer.setPhone(lecturer.getPhone());
        updatedLecturer.setDepartments(lecturer.getDepartments());
        updatedLecturer.setCourses(lecturer.getCourses());
        lecturerRepository.save(updatedLecturer);
        return updatedLecturer;
    }

    @Override
    public void deleteLecturerByIdSvc(int lecturerId) {
        lecturerRepository.deleteById(lecturerId);
    }

    @Override
    public List<Lecturer> getLecturersByDepartmentSvc(Department department) {
        return lecturerRepository.findAllByDepartments(department);
    }

    @Override
    public List<Lecturer> getLecturersByCourseSvc(Course course) {
        return lecturerRepository.findAllByCourses(course);
    }
}
