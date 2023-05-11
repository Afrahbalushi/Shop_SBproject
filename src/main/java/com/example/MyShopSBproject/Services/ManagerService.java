package com.example.MyShopSBproject.Services;

import com.example.MyShopSBproject.Models.Manager;
import com.example.MyShopSBproject.Repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;
    @Autowired
    ManagerService managerService;

    @RequestMapping(value = "getById")
    public Manager getManagerById(@RequestParam("id") Integer Manager_id){
        return managerService.getManagerById(Manager_id);}


}
