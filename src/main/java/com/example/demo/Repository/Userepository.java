package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.User;

public interface Userepository extends JpaRepository<User,Long> {
    
}
