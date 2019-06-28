package com.gmail.vaadin.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.vaadin.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
