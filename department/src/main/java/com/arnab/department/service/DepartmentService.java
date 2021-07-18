package com.arnab.department.service;

import com.arnab.department.entity.Department;
import com.arnab.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findByDepartmentId(Long departmentId){
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public Department saveDepartment(Department department) {
        log.info("Inside save method of dept service");
        departmentRepository.save(department);
        return department;
    }
}
