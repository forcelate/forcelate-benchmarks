package com.jedivision.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Task implements Serializable {
    private long id;
    private String description;
}
