package com.springmvc.Spring.MVC.service;

import com.springmvc.Spring.MVC.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee) throws Exception;
    Employee getEmployeeById(long id);
    void deleteEmployee(long id);

}
