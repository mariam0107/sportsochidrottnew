/*
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author maria
 */
@Entity
public class region {

    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="regionid")
  private Integer regionid;
  @Column(name="regionname")
  private String regionname;
  
  @ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,
      CascadeType.MERGE},mappedBy="allRegions")
  private Set<clubdetails> allClubs=new HashSet<>();
    

    public region() {
    }

    public region(String regionname) {
         this.regionname = regionname;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }
public Set<clubdetails> getAllClubs() {
        return allClubs;
    }

    public void setAllClubs(Set<clubdetails> allClubs) {
        this.allClubs = allClubs;
    }

    
    
  
}

