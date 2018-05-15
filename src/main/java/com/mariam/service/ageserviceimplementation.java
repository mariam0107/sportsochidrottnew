
package com.mariam.service;
//
import java.util.Optional;
import java.util.Set;
import com.mariam.model.age;

import org.springframework.beans.factory.annotation.Autowired;
import com.mariam.dao.agerepository;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

@Service
public class ageserviceimplementation implements ageservice {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private long generatedKey;
	private String rescuedstring;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAage(String agemin, String agemax){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("INSERT INTO age(agemin,agemax)VALUES(?,?,?)",agemin,agemax );
		
	}
	
	public void deleteAage(Integer ageid){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("DELETE FROM dog WHERE ageid="+ageid);
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