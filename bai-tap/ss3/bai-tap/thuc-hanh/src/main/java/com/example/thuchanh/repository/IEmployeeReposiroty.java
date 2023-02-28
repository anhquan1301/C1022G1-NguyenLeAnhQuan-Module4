package com.example.thuchanh.repository;

import com.example.thuchanh.model.Employee;

import java.util.List;

public interface IEmployeeReposiroty {
    List<Employee> showList(String name);
    Employee findById(int id);
    void save(Employee employee);
}
