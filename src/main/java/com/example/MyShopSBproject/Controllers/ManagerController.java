package com.example.MyShopSBproject.Controllers;

import com.example.MyShopSBproject.Models.Manager;
import com.example.MyShopSBproject.Services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Manager getManagerById(Integer Manager_id) {
        return managerService.getManagerById(Manager_id);
    }
}
