package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.CustomerDetails;

public interface BusRepository extends JpaRepository<CustomerDetails, Integer> {

}
