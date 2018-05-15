package com.mariam.service;

import java.util.Set;
import com.mariam.model.clubdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mariam.dao.clubdetailsrepository;

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
public class clubdetailsserviceimplementation implements clubdetailsservice {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private long generatedKey;
	private String rescuedstring;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAclub(String OrgNumber,String clubname,String clubemail,String clubpwd,String clubphone,String clubwebsite)
        {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("INSERT INTO clubdetails(OrgNumber,clubname,clubemail,clubpwd,clubphone,clubwebsite)VALUES(?,?,?,?,?,?,?)",OrgNumber,clubname,clubemail,clubpwd,clubphone,clubwebsite);
		
	}
	
	public void deleteAclub(Integer clubid){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("DELETE FROM clubdetails WHERE clubid="+clubid);
	}
	

}
//    package com.mariam.service;
//
//import java.util.Optional;
//import java.util.Set;
//import com.mariam.model.clubdetails;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.mariam.dao.clubdetailsrepository;
//
//public class clubdetailsserviceimplementation implements clubdetailsservice{
//    
//private clubdetailsrepository clubdetailsrepositoryo;
//@Autowired
//public void setClubdetailsrepositoryo(clubdetailsrepository clubdetailsrepositoryo) {
//        this.clubdetailsrepositoryo = clubdetailsrepositoryo;
//    }
//        
//    @Override
//    public Set<clubdetails> getAllClubDetails() {
//        return (Set<clubdetails>) this.clubdetailsrepositoryo.findAll();
//    }  
//    
//    @Override
//    public Optional<clubdetails> getClubById(Integer id) {
//        return this.clubdetailsrepositoryo.findById(id);
//    }
//    
//    @Override
//    public clubdetails saveClub(clubdetails c) {
//        return this.clubdetailsrepositoryo.save(c);
//    }
//    
//    @Override
//    public void deleteClub(Integer id) {
//        this.clubdetailsrepositoryo.deleteById(id);
//    }
//    

    

