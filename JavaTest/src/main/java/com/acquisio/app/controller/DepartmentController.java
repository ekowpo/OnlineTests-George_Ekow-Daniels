package com.acquisio.app.controller;

import com.acquisio.app.domain.Department;
import com.acquisio.app.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @RequestMapping("/departments")
    public Map<Long, Department> listDepartments() throws SQLException {
        return departmentRepository.findAll().stream()
                .collect(Collectors.toMap(Department::getId, Function.identity()));
    }
        @RequestMapping(value = "/departments", method = RequestMethod.POST)
    public ResponseEntity<String> createEmployee(@RequestBody Department department) 
    {
    	departmentRepository.save(department);
        System.out.println(department);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
