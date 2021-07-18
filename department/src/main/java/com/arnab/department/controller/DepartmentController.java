package com.arnab.department.controller;

import com.arnab.department.entity.Department;
import com.arnab.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") long departmentId) {
        log.info("inside findDepartmentById method of departmentController");
        return departmentService.findByDepartmentId(departmentId);
    }
    @PostMapping("/")
    public Department postDepartment(@RequestBody Department department){
        log.info("Inside postDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }
}
