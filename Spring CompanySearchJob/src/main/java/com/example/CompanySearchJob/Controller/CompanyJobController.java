package com.example.CompanySearchJob.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CompanySearchJob.Model.CompanyJob;
import com.example.CompanySearchJob.Services.CompanyJobServices;

@RestController
@RequestMapping("/api/v1/")



public class CompanyJobController {
    @Autowired
    
    private CompanyJobServices companyJobServices;

    @PostMapping("/saveCompanyJob")

        //Create a Save Method

        public String saveCompanyJob(@RequestBody CompanyJob companyJob){
            CompanyJob savedCompanyJob = companyJobServices.save(companyJob);

            int companyJobId = savedCompanyJob.getId();
            String message = "Company Job Saved with ID: " + companyJobId;
            System.out.println(message);
            return message;

            
        }
    }

