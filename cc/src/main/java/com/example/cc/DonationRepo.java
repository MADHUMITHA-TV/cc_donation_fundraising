package com.example.cc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DonationRepo extends JpaRepository<Donation,Integer>{

    
}