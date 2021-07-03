package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Customer;

//import省略
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
