package com.example.MyShopSBproject.Controllers;

import com.example.MyShopSBproject.Models.Employee;
import com.example.MyShopSBproject.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Employee getEmployeeById(@RequestParam("id") Integer Employee_id)  {
        return employeeService.getEmployeeById(Employee_id);
    }

}
