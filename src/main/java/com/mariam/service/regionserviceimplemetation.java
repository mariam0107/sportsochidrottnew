/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.service;

import java.util.Optional;
import java.util.Set;
import com.mariam.model.region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mariam.dao.regionrepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

@Service
public class regionserviceimplemetation implements regionservice {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private long generatedKey;
	private String rescuedstring;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAregion(String regionname){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("INSERT INTO region(regionname)VALUES(?)",regionname );
		
	}
	
	public void deleteAregion(Integer regionid){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("DELETE FROM region WHERE regionid="+regionid);
	}
	

}
//
//public class ageserviceimplementation implements ageservice{
//    
//    private agerepository agerepositoryo;
//@Autowired
//public void setAgerepositoryo(agerepository agerepositoryo) {
//        this.agerepositoryo = agerepositoryo;
//    }
//
//    @Override
//    public Set<age> getAllAges() {
//        return (Set<age>) this.agerepositoryo.findAll();
//    } 
//    
//    @Override
//    public Optional<age> getAgeById(Integer id) {
//        return this.agerepositoryo.findById(id);
//    }
//    
//    @Override
//    public age saveAge(age a) {
//        return this.agerepositoryo.save(a);
//    }
//    
//    @Override
//    public void deleteAge(Integer id) {
//        this.agerepositoryo.deleteById(id);
//    }
//    
//}
//@Service
//public class regionserviceimplemetation implements regionservice {
//  
//
//private regionrepository regionrepositoryo;
//@Autowired
//public void setRegionrepositoryo(regionrepository regionrepositoryo) {
//        this.regionrepositoryo = regionrepositoryo;
//    }
//      
//    @Override
//    public Set<region> getAllRegion() {
//        return (Set<region>) this.regionrepositoryo.findAll();
//    }
//  
//    
//    @Override
//    public Optional<region> getRegionById(Integer id) {
//        return this.regionrepositoryo.findById(id);
//    }
//    
//    @Override
//    public region saveRegion(region r) {
//        return this.regionrepositoryo.save(r);
//    }
//    
//    @Override
//    public void deleteRegion(Integer id) {
//        this.regionrepositoryo.deleteById(id);
//    }
//    
//}
//    

  

