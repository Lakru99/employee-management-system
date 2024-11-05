package edu.icet.service.employee;

import edu.icet.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    void addEmployee(Employee employee);
    void deleteEmployeeById(Integer id);
    Employee searchEmployeeById(Integer id);
    void updateEmployeeById(Employee employee);
}
