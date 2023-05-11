package com.example.MyShopSBproject.Services;

import com.example.MyShopSBproject.Models.Employee;
import com.example.MyShopSBproject.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public Employee getEmployeeById(Integer Employee_id){
        return employeeRepository.findById(Employee_id).get();
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


}
