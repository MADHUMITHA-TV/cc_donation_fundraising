package com.example.cc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class DonationController {
    @Autowired
    DonationService ds;

    @PostMapping("/api/donate")
    public ResponseEntity<Donation> adddata(@RequestBody Donation d)
    {
        Donation obj=ds.create(d);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }

    @GetMapping("/api/donate")
    public List<Donation> getAll() {
        return ds.getAll();
    }

    @PutMapping("/api/donate/{Id}")
    public ResponseEntity<Donation> putMethod(@PathVariable("Id") int Id,@RequestBody Donation pd)
    {
        if(ds.updateDetails(Id,pd) == true)
        {
            return new ResponseEntity<>(pd,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/api/donate/{Id}")
    public ResponseEntity<Boolean> delete(@PathVariable("Id") int Id)
    {
        if(ds.deleteJob(Id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

    
}