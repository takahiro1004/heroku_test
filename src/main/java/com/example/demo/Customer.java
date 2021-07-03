package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {}
    public Long getId() {
    	return id;
    }
    public String getLastName() {
    	return lastName;
    }
    public String getFirstName() {
    	return firstName;
    }
	//getter, setter 省略
}