/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.service;

import java.util.Optional;
import java.util.Set;
import com.mariam.model.sports;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mariam.dao.sportsrepository;

/**
 *
 * @author maria
 */



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
public class sportsserviceimplementation implements sportsservice {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private long generatedKey;
	private String rescuedstring;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAsport(String sportsitem){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("INSERT INTO sports(sportsitem)VALUES(?)",sportsitem );
		
	}
	
	public void deleteAsport(Integer sportsid){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("DELETE FROM sports WHERE sportsid="+sportsid);
	}
	

}



//@Service
//public class sportsserviceimplementation implements sportsservice{
//
//private sportsrepository sportsrepositoryo;
//@Autowired
// public void setSportsrepositoryo(sportsrepository sportsrepositoryo) {
//        this.sportsrepositoryo = sportsrepositoryo;
//    }     
//    @Override
//    public Set<sports> getAllSports() {
//        return (Set<sports>) this.sportsrepositoryo.findAll();
//    }
//
//    public sportsrepository getSportsrepositoryo() {
//        return sportsrepositoryo;
//    }
//   
//    
//    @Override
//    public Optional<sports> getSportsById(Integer id) {
//        return this.sportsrepositoryo.findById(id);
//    }
//    
//    @Override
//    public sports saveSport(sports s) {
//        return this.sportsrepositoryo.save(s);
//    }
//    
//    @Override
//    public void deleteSport(Integer id) {
//        this.sportsrepositoryo.deleteById(id);
//    }
//    
//}
//    
//
