package com.example.MyShopSBproject.Models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String email;
    String position;
}
