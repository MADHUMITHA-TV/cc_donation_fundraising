package com.example.cc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Donation {
    @Id
    int Id;
    String email,name;
    String modeOfTransfer;
    int amount;
    String typeOfDonation,location;
   
    public Donation()
    {
        
    }

    public Donation(int Id,String modeOfTransfer,int amount,String typeOfDonation,String location)
    {
        this.Id=Id;
        this.modeOfTransfer=modeOfTransfer;
        this.amount=amount;
        this.typeOfDonation=typeOfDonation;
        this.location=location;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getModeOfTransfer() {
        return modeOfTransfer;
    }

    public void setModeOfTransfer(String modeOfTransfer) {
        this.modeOfTransfer = modeOfTransfer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTypeOfDonation() {
        return typeOfDonation;
    }

    public void setTypeOfDonation(String typeOfDonation) {
        this.typeOfDonation = typeOfDonation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }   
}