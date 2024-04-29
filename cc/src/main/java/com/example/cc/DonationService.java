package com.example.cc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DonationService {
    @Autowired
    private DonationRepo dr;
    
    public Donation create(Donation d)
    {   
        return dr.save(d);
    }

    public Donation getbyid(int Id)
    {
        return dr.findById(Id).orElse(null);
    }

    public List<Donation> getAll()
    {
        return dr.findAll();
    }

    public boolean updateDetails(int Id,Donation p)
        {
            if(dr.findById(Id)==null)
            {
                return false;
            }
            try{
                dr.save(p);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
        public boolean deleteJob(int Id)
        {
            if(this.getbyid(Id) == null)
            {
                return false;
            }
            dr.deleteById(Id);
            return true;
        }      
}