package edu.icet.service;

import edu.icet.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployeeById(Integer id) {

    }

    @Override
    public Employee searchEmployeeById(Integer id) {
        return null;
    }

    @Override
    public void updateEmployeeById(Employee employee) {

    }
}
