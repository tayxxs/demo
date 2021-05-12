package com.reid.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    
    private @Id @GeneratedValue Long id;
    
}
