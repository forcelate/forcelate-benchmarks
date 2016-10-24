package com.jedivision.temple.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Master implements Serializable {
    private long id;
    private String balance;
    private int age;
    private String sword;
    private String name;
    private Gender gender;
    private String company;
    private String email;
    private String phone;
    private String address;
    private String about;
    private Date started;
    private double latitude;
    private double longitude;
    private List<Task> tasks;
    private List<Force> forces;
}
