/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.service;

import java.util.Optional;
import java.util.Set;
import com.mariam.model.sports;

/**
 *
 * @author maria
 */
public interface sportsservice {
   void addAsport(String sportsitem);
	
void deleteAsport(Integer sportsid);

//    Set<sports> getAllSports();
//    Optional<sports> getSportsById(Integer id);
//    sports saveSport(sports sport);
//    void deleteSport(Integer sportsid);
}
    

