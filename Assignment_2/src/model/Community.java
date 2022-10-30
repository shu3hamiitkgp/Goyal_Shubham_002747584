/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author shubhamgoyal
 */
public class Community {
    
    private String communityName;
    
    private List<House> houses;
    
    private HospitalDirectory hospDir;
    
//    private Date createdDate;
//    public Community(){
////        super();
//        this.hospDir=new HospitalDirectory();
//        this.houses=houses;
//        this.communityName=communityName;
//        
//    }
    
    public Community(String communityName, List<House> houses,HospitalDirectory hospDir) {
//        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.communityName = communityName;
        this.houses = houses;
        this.hospDir=new HospitalDirectory();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }

    public HospitalDirectory getHospDir() {
        return hospDir;
    }

    public void setHospDir(HospitalDirectory hospDir) {
        this.hospDir = hospDir;
    }
    
    @Override
    public String toString() {
        return communityName;
    }

      
}
