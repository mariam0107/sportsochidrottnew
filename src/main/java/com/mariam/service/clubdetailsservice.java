
package com.mariam.service;

import java.util.Optional;
import java.util.Set;
import com.mariam.model.clubdetails;


public interface clubdetailsservice {
  void addAclub(String OrgNumber,String clubname,String clubemail,String clubpwd,String clubphone,String clubwebsite);
	
void deleteAclub(Integer clubid);
//    Set<clubdetails> getAllClubDetails();
//    Optional<clubdetails> getClubById(Integer id);
//    clubdetails saveClub(clubdetails c);
//    void deleteClub(Integer clubid);
}   

