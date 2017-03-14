package com.acquisio.app.controller;

import com.acquisio.app.domain.Employee;
import com.acquisio.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/employees")
    public Map<Long, Employee> listEmployees() throws SQLException {
        return employeeRepository.findAll().stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity()));
    }
    
       @RequestMapping(method=RequestMethod.PUT, value="/employees/{id}/{salary}/{department}")
    public ResponseEntity<String> update(@PathVariable("id") String id,@PathVariable("salary") String salary, @PathVariable("department") String deptid) {
      if(Integer.parseInt(salary)>10000&& Integer.parseInt(salary)<500000){
    	
    	  Employee update = employeeRepository.findOne(Long.parseLong(id));
    	  Department dept = departmentRepository.findOne(Long.parseLong(deptid));
    	  
      update.setSalary(Integer.parseInt(salary));
      update.setDepartment(dept);
     
       employeeRepository.save(update);

       return new ResponseEntity("Update successfull",HttpStatus.OK);
       
      
      }

      return new ResponseEntity("Did not update",HttpStatus.NOT_MODIFIED);
    }
}
