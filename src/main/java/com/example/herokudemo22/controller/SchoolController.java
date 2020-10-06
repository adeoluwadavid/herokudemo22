/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.herokudemo22.controller;

import com.example.herokudemo22.model.School;
import com.example.herokudemo22.repository.SchoolRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Adewole
 */
@RestController
@RequestMapping("/api")
public class SchoolController {
    @Autowired
    private SchoolRep schoolRep;
    
    @GetMapping("/all")
    public List<School> getAll(){
         return schoolRep.findAll();
    }
    
    @PostMapping("/post")
    public School post(@RequestBody School s){
        return schoolRep.save(s);
    }
}
