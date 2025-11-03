package com.springmvc.Spring.MVC.repository;

import com.springmvc.Spring.MVC.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
