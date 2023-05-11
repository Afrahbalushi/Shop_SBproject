package com.example.MyShopSBproject.Controllers;


import com.example.MyShopSBproject.Models.Manager;
import com.example.MyShopSBproject.Services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @GetMapping(value = "getById")
    public Manager getManagerById(@RequestParam Integer Manager_id) {
        return managerService.getManagerById(Manager_id);
    }

    @GetMapping(value = "getAll")
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }



}
