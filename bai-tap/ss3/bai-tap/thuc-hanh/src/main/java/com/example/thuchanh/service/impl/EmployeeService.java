package com.example.thuchanh.service.impl;

import com.example.thuchanh.model.Employee;
import com.example.thuchanh.repository.IEmployeeReposiroty;
import com.example.thuchanh.repository.impl.EmployeeRepository;
import com.example.thuchanh.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeReposiroty iEmployeeReposiroty;
    @Override
    public List<Employee> showList(String name) {
        if(name==null){
            name="";
        }
        return iEmployeeReposiroty.showList(name);
    }

    @Override
    public Employee findById(int id) {
        return null;
    }
    @Override
    public void save(Employee employee) {
        iEmployeeReposiroty.save(employee);
    }
}
