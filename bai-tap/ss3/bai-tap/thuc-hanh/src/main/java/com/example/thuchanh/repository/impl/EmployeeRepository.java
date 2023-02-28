package com.example.thuchanh.repository.impl;

import com.example.thuchanh.model.Employee;
import com.example.thuchanh.repository.IEmployeeReposiroty;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeRepository implements IEmployeeReposiroty {
  private static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee(1,"Nam","0909999999"));
        employeeList.add(new Employee(2,"A","0909123456"));
        employeeList.add(new Employee(3,"B","0909654321"));
    }
    @Override
    public List<Employee> showList(String name) {
        List<Employee> newList = new ArrayList<>();
        for (int i = 0; i <employeeList.size() ; i++) {
            if(employeeList.get(i).getName().contains(name)){
                newList.add(employeeList.get(i));
            }
        }
        return newList;
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }
}
