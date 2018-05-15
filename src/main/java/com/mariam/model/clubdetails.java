
package com.mariam.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class clubdetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="clubid")
  private Integer clubid; 
  @Column(name="OrgNumber")
  private String OrgNumber;
  @Column(name="clubname")
  private String clubname;
  @Column(name="clubemail")
  private String clubemail;

    
  @Column(name="clubpwd")
  private String clubpwd;
  @Column(name="clubphone")
  private String clubphone;
  @Column(name="clubwebsite")
  private String clubwebsite;
  
  @ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE})
  @JoinTable(name="clubdetails_sports",joinColumns=@JoinColumn(name="clubid"),
          inverseJoinColumns=@JoinColumn(name="sportsid"))
  private Set<sports> allSports=new HashSet<>();
  
  
  @ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE})
  @JoinTable(name="clubdetails_region",joinColumns=@JoinColumn(name="clubid"),
          inverseJoinColumns=@JoinColumn(name="regionid"))
  private Set<region> allRegions=new HashSet<>();

    public Set<region> getAllRegions() {
        return allRegions;
    }

    public void setAllRegions(Set<region> allRegions) {
        this.allRegions = allRegions;
    }

    public Set<sports> getAllSports() {
        return allSports;
    }

    public void setAllSports(Set<sports> allSports) {
        this.allSports = allSports;
    }
  
    
  public clubdetails(Integer clubid) {
        this.clubid = clubid;
    }

    public clubdetails(String OrgNumber, String clubname, String clubpwd, String clubphone, String clubwebsite) {
        this.OrgNumber = OrgNumber;
        this.clubname = clubname;
        this.clubpwd = clubpwd;
        this.clubphone = clubphone;
        this.clubwebsite = clubwebsite;
    }

    public Integer getClubid() {
        return clubid;
    }

    public void setClubid(Integer clubid) {
        this.clubid = clubid;
    }

    public String getOrgNumber() {
        return OrgNumber;
    }

    public void setOrgNumber(String OrgNumber) {
        this.OrgNumber = OrgNumber;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getClubpwd() {
        return clubpwd;
    }

    public void setClubpwd(String clubpwd) {
        this.clubpwd = clubpwd;
    }

    public String getClubphone() {
        return clubphone;
    }

    public void setClubphone(String clubphone) {
        this.clubphone = clubphone;
    }

    public String getClubwebsite() {
        return clubwebsite;
    }

    public void setClubwebsite(String clubwebsite) {
        this.clubwebsite = clubwebsite;
    }
  
  public String getClubemail() {
        return clubemail;
    }

    public void setClubemail(String clubemail) {
        this.clubemail = clubemail;
    }
  
}
