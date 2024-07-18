package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Apartment;



public interface ApartmentRepository extends JpaRepository<Apartment,Long> {

    
} 
    

