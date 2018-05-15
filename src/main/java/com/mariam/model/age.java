package com.mariam.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author maria
 */
public class age {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Integer ageid;
    @Column
    private Integer agemin;
    
    @Column
    private Integer agemax;
    
    @ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,
      CascadeType.MERGE},mappedBy="allAges")
    private Set<sports> allSports;

    public Set<sports> getAllSports() {
        return allSports;
    }

    public void setAllSports(Set<sports> allSports) {
        this.allSports = allSports;
    }

    public Integer getAgeid() {
        return ageid;
    }

    public void setAgeid(Integer ageid) {
        this.ageid = ageid;
    }

    public Integer getAgemin() {
        return agemin;
    }

    public void setAgemin(Integer agemin) {
        this.agemin = agemin;
    }

    public Integer getAgemax() {
        return agemax;
    }

    public void setAgemax(Integer agemax) {
        this.agemax = agemax;
    }
    
    
}
