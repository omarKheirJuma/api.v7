package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Apartment;
import com.example.demo.Repository.ApartmentRepository;

@CrossOrigin
@RestController
@RequestMapping("/apartment/v1")
public class Apartmentcontoller {
     @ Autowired
    private ApartmentRepository ApartmentRepository;
    
    @GetMapping("/get")
    public ResponseEntity<List<Apartment>>getAllApartment(){
        List<Apartment>std =ApartmentRepository.findAll();
        return new ResponseEntity<>(std,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Apartment> addApartmeny (@RequestBody Apartment Apartment) 
    {
        Apartment std = ApartmentRepository.save(Apartment );
        return new ResponseEntity<>(std,HttpStatus.CREATED);
    }
    
@GetMapping("/{id}")
  public ResponseEntity<Apartment> getApartmentById(@PathVariable long id )
  {
    Optional<Apartment> std = ApartmentRepository.findById(id);
    return new ResponseEntity<>(std.get(),HttpStatus.OK);
  }

      @DeleteMapping("/{id}")
  public ResponseEntity<String> delateApartment(@PathVariable long id )
  {
    return new ResponseEntity<String>("delete data successfull", HttpStatus.OK);
  }
  @PutMapping("path/{id}")
  public ResponseEntity<Apartment> updateApartment(@PathVariable long id , @RequestBody Apartment std )
{
    std.setId(id);
    Apartment existingApartment = ApartmentRepository.findById(std.getId()).get();
    existingApartment.setAddress(std.getAddress());
    existingApartment.setRent(std.getRent());
    existingApartment.setRoom(std.getRoom());
    existingApartment.setAvailablestatus(std.getAvailablestatus());
    
    Apartment updateApartment = ApartmentRepository.save(existingApartment);
    return new ResponseEntity<>(updateApartment,HttpStatus.CREATED);
}






}
