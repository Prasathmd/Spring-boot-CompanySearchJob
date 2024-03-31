package com.example.CompanySearchJob.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CompanySearchJob.Model.CompanyJob;
import com.example.CompanySearchJob.Model.CompanyJobRepository;

@Service
public class CompanyJobServices {
    @Autowired  
    private CompanyJobRepository companyJobRepository;

    //create a save method

    public CompanyJob save(CompanyJob companyJob){
        CompanyJob companyJob1 = companyJobRepository.save(companyJob);
        System.out.println("Saved successfully = " + companyJob.getId());
        return companyJob1;
    }
}
