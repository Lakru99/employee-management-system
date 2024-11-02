package edu.icet.controller;

import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {
    final EmployeeService employeeService;
    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    @DeleteMapping("delete-employee/{id}")
    public void deleteEmployeeById(@PathVariable Integer id){
        employeeService.deleteEmployeeById(id);
    }
    @GetMapping("search-emplyee/{id}")
    public Employee searchEmployeeById(@PathVariable Integer id){
        return employeeService.searchEmployeeById(id);
    }
    @PutMapping("update-employee")
    public void updateEmployeeById(@RequestBody Employee employee){
        employeeService.updateEmployeeById(employee);
    }
}
