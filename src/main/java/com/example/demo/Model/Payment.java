package com.example.demo.Model;

import java.util.Optional;

import com.example.demo.Services.payment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column (nullable = false)
    private String leaseid;
    @Column(nullable=false)
    private String paymentdate;
    @Column(nullable=false)
    private String Amount;

    
    public Payment(){

   

    }


    public long getId() {
        return Id;
    }


    public void setId(long id) {
        Id = id;
    }


    public String getLeaseid() {
        return leaseid;
    }


    public void setLeaseid(String leaseid) {
        this.leaseid = leaseid;
    }


    public String getPaymentdate() {
        return paymentdate;
    }


    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate;
    }


    public String getAmount() {
        return Amount;
    }


    public void setAmount(String amount) {
        Amount = amount;
    }


    public Payment save(Payment payment) {
        
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }


    public static Optional<payment> findById(long id2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}
