package com.tw.apistackbase.repository;

import com.tw.apistackbase.core.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByName(String name);
    List<Employee> findByAge(int age);
}