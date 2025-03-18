package com.deepak.lecturers.service;

import com.deepak.lecturers.model.Department;
import com.deepak.lecturers.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentService implements IDepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartmentsSvc() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentByIdSvc(int deptId) {
        return departmentRepository.findById(deptId).get();
    }

    @Override
    public void addNewDepartmentSvc(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public Department updateDepartmentNameSvc(Department department) {
        Department updatedDepartment = getDepartmentByIdSvc(department.getId());
        updatedDepartment.setDeptName(department.getDeptName());
        departmentRepository.save(updatedDepartment);
        return updatedDepartment;
    }

    @Override
    public void deleteDepartmentByIdSvc(int deptId) {
        departmentRepository.deleteById(deptId);
    }
}
