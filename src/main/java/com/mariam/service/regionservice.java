/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.service;

import java.util.Optional;
import java.util.Set;
import com.mariam.model.region;
import com.mariam.model.sports;

/**
 *
 * @author maria
 */
public interface regionservice {
 void addAregion(String regionname);
	
void deleteAregion(Integer regionid);
//    Set<region> getAllRegion();
//    Optional<region> getRegionById(Integer id);
//    region saveRegion(region r);
//    void deleteRegion(Integer regionid);
}
    

   

