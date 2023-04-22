package com.hdfc.employeemanagementsystem.restcontroller;

import com.hdfc.employeemanagementsystem.entity.Employee;
import com.hdfc.employeemanagementsystem.exceptions.EmployeeNotFoundException;
import com.hdfc.employeemanagementsystem.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @GetMapping("/getRatingBy/{employeeId}")
    public ResponseEntity<Employee> getRatingByCustomerId(@PathVariable int employeeId) throws EmployeeNotFoundException {
        Employee employee = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employee);

    }
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAllEmployee();
    }
}
