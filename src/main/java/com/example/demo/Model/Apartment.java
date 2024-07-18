package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Apartment")
public class Apartment {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column (nullable = false)
    private String Address;
    @Column(nullable=false)
    private String Rent;
    @Column(nullable=false)
    private String Room;
    @Column(nullable=false)
    private String Availablestatus;

    
    public long getId() {
        return Id;
    }


    public void setId(long id) {
        Id = id;
    }


    public String getAddress() {
        return Address;
    }


    public void setAddress(String address) {
        Address = address;
    }


    public String getRent() {
        return Rent;
    }


    public void setRent(String rent) {
        Rent = rent;
    }


    public String getRoom() {
        return Room;
    }


    public void setRoom(String room) {
        Room = room;
    }


    public String getAvailablestatus() {
        return Availablestatus;
    }


    public void setAvailablestatus(String availablestatus) {
        Availablestatus = availablestatus;
    }


    public Apartment(){

   

    }
    
}
