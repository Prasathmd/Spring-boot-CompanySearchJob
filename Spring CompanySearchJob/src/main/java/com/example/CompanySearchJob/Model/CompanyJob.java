package com.example.CompanySearchJob.Model;

import org.aspectj.apache.bcel.classfile.Module.Provide;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CompanyJob {
    @Id
    @GeneratedValue

    private int id;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "skills")
    private String skills;

    @Column(name = "year_of_experience")
    private int yearOfExperience;

    @Column(name = "salary")
    private int salary;

}
