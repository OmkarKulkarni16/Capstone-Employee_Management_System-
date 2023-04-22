package com.hdfc.employeemanagementsystem.service;

import com.hdfc.employeemanagementsystem.entity.Employee;
import com.hdfc.employeemanagementsystem.exceptions.EmployeeNotFoundException;
import com.hdfc.employeemanagementsystem.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements IEmployeeService {
   @Autowired
    IEmployeeRepository employeeRepository;
    @Override
    public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException {
        return employeeRepository.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException("Invalid Employee ID = "+employeeId));
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
