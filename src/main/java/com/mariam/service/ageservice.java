
package com.mariam.service;

import java.util.Optional;
import java.util.Set;
import com.mariam.model.age;
import java.util.Date;

/**
 *
 * @author maria
 */
public interface ageservice {
    void addAage(String agemin, String agemax);
	
	void deleteAage(Integer ageid);
//    Set<age> getAllAges();
//    Optional<age> getAgeById(Integer id);
//    age saveAge(age a);
//    void deleteAge(Integer ageid);
}
