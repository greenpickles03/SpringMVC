package com.springmvc.Spring.MVC.service;

import com.springmvc.Spring.MVC.entity.Employee;
import com.springmvc.Spring.MVC.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        List<Employee> employeeList = repository.findAll()
                .stream()
                .filter(x -> x.getEmail().equalsIgnoreCase(employee.getEmail()))
                .toList();

        if(employeeList.isEmpty()){
            repository.save(employee);
        }
    }

    @Override
    public Employee getEmployeeById(long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void deleteEmployee(long id) {
        repository.deleteById(id);
    }
}
