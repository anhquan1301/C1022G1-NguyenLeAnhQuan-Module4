package com.example.thuchanh.service;

import com.example.thuchanh.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> showList(String name);
    Employee findById(int id);
    void save(Employee employee);
}
