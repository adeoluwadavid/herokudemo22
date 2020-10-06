/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.herokudemo22.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Adewole
 */
@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String school;
    
    public School(){
        
    }
    public School(String fullname, String school){
        this.fullname =fullname;
        this.school = school;
    }
     
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getFullname(){
        return this.fullname;
    }
    public String getSchool(){
        return this.school;
    }
    public void setFullname(String fullname){
        this.fullname =fullname;
    }
    public void setSchool(String school){
        this.school = school;
    }
}
