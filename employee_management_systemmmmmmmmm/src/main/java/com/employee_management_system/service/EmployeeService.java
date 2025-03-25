package com.employee_management_system.service;

import java.util.List;
import java.util.Optional;

import com.employee_management_system.entity.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Long id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
