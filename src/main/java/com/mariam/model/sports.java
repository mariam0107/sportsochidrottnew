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
/**
 *
 * @author maria
 */
@Entity
public class sports{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="sportsid")
  private Integer sportsid;   
  
  @Column(name="sportsitem")
  private String sportsitem;
  
  @ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,
      CascadeType.MERGE},mappedBy="allSports")
  private Set<clubdetails> allClubs;
  
  @ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE})
  @JoinTable(name="sports_age",joinColumns=@JoinColumn(name="sportsid"),
          inverseJoinColumns=@JoinColumn(name="ageid"))
  private Set<age> allAges=new HashSet<>();
       
      public sports() {
    }
      public sports(Integer sportsid, String sportsitem, Set<clubdetails> allClubs) {
        super();
        this.sportsid = sportsid;
        this.sportsitem = sportsitem;
        this.allClubs = allClubs;
    }
      public sports(String sportsitem, Set<clubdetails> allClubs) {
        super();
        this.sportsitem = sportsitem;
        this.allClubs = allClubs;
    }

    public Integer getSportsid() {
        return sportsid;
    }

    public void setSportsid(Integer sportsid) {
        this.sportsid = sportsid;
    }

    

    public String getSportsitem() {
        return sportsitem;
    }

    public void setSportsitem(String sportsitem) {
        this.sportsitem = sportsitem;
    }

    public Set<clubdetails> getAllClubs() {
        return allClubs;
    }

    public void setAllClubs(Set<clubdetails> allClubs) {
        this.allClubs = allClubs;
    }

    public Set<age> getAllAges() {
        return allAges;
    }

    public void setAllAges(Set<age> allAges) {
        this.allAges = allAges;
    }

    
}



