package com.example.MyShopSBproject.Services;

import com.example.MyShopSBproject.Models.Employee;
import com.example.MyShopSBproject.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "getById")
    public Employee getEmployeeById(@RequestParam("id") Integer Employee_id){
        return employeeService.getEmployeeById(Employee_id);
    }
}
