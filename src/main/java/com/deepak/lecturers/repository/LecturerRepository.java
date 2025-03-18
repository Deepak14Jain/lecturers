package com.deepak.lecturers.repository;

import com.deepak.lecturers.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LecturerRepository extends JpaRepository <Lecturer, Integer> {
    List<Lecturer> findAllByDepartmentId(int deptId);

    List<Lecturer> findAllByCourseId(int courseId);
}
