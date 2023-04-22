package com.hdfc.employeemanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "employeeinformation")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeid")
    private int EmployeeId;

    @Column(name = "employeename")
    private String EmployeeName;

    @Column(name = "employeedateofbirth")
    private String EmployeeDateOfBirth;

    public Employee(int employeeId, String employeeName, String employeeDateOfBirth) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        EmployeeDateOfBirth = employeeDateOfBirth;
    }

    public Employee() {
        super();
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeDateOfBirth() {
        return EmployeeDateOfBirth;
    }

    public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
        EmployeeDateOfBirth = employeeDateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeDateOfBirth='" + EmployeeDateOfBirth + '\'' +
                '}';
    }


}
