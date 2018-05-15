/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.dao;

import com.mariam.model.sports;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author maria
 */
public interface sportsrepository extends CrudRepository<sports,Integer> {
    
}
