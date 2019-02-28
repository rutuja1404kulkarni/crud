package com.customer.crud.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.customer.crud.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
