package com.deepak.lecturers.service;

import com.deepak.lecturers.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDepartmentService {
    public List<Department> getAllDepartmentsSvc();
    public Department getDepartmentByIdSvc(int deptId);
    public void addNewDepartmentSvc(Department department);
    public Department updateDepartmentNameSvc(Department department);
    public void deleteDepartmentByIdSvc(int deptId);
}
