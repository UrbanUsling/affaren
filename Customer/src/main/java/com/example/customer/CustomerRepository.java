package com.example.customer;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


    public interface CustomerRepository extends JpaRepository<Customers, Long> {

        public List<Customers> findCustByName(String name);


    }

