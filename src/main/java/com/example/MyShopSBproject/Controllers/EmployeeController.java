package com.example.MyShopSBproject.Controllers;

import com.example.MyShopSBproject.Models.Employee;
import com.example.MyShopSBproject.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping(value = "getById")
    public Employee getEmployeeById(@RequestParam Integer Employee_id)  {
        return employeeService.getEmployeeById(Employee_id);
    }

    @GetMapping(value = "getAll")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
