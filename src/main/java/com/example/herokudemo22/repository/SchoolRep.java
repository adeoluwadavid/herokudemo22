/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.herokudemo22.repository;

import com.example.herokudemo22.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Adewole
 */
@Repository
public interface SchoolRep extends JpaRepository<School, Long> {
    
}
