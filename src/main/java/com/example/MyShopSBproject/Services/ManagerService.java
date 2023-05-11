package com.example.MyShopSBproject.Services;


import com.example.MyShopSBproject.Models.Manager;
import com.example.MyShopSBproject.Repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;

    public Manager getManagerById(Integer Manager_id){
        return managerRepository.findById(Manager_id).get();
    }

    public List<Manager> getAllManagers(){
        return managerRepository.findAll();
    }

}
