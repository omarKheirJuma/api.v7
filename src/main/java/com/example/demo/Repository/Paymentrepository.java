package com.example.demo.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Payment;

public interface Paymentrepository extends JpaRepository<Payment,Long>{

    @SuppressWarnings("rawtypes")
    static List findByid(String id) {
    
        throw new UnsupportedOperationException("Unimplemented method 'findByid'");
    }

    static void deleteByid(long id) {
    
        throw new UnsupportedOperationException("Unimplemented method 'deleteByid'");
    }
    
}
