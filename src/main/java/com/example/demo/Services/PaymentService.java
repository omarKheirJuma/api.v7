package com.example.demo.Services;

import org.springframework.stereotype.Service;

import java.util.List;
import com.example.demo.Model.Payment;
import com.example.demo.Repository.Paymentrepository;

@Service
public class PaymentService {

    public Payment createPayment(Payment payment){
        return payment .save(payment);
        
    }
    @SuppressWarnings("unchecked")
    public List <payment>getPaymentByid(String id){
        return Paymentrepository.findByid(id);
    }
public void deletePayment(long id ){
    Paymentrepository.deleteByid(id);
}
    
}
