package com.deepak.lecturers.repository;

import com.deepak.lecturers.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department, Integer> {
}
