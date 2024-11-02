package edu.icet.service;

import edu.icet.dto.Employee;
import edu.icet.entity.EmployeeEntity;
import edu.icet.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList= new ArrayList<>();
        //here comes a emplyee entity and thats why we map it to emplyee class
        repository.findAll().forEach(entity ->{
            employeeList.add(mapper.map(entity, Employee.class));
        });
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        //here it will gives a emplyee and we need to map into a emplyee Entity
        repository.save(mapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Employee searchEmployeeById(Integer id) {
        return mapper.map(repository.findById(id), Employee.class);
    }

    @Override
    public void updateEmployeeById(Employee employee) {
        repository.save(mapper.map(employee, EmployeeEntity.class));
    }
}
