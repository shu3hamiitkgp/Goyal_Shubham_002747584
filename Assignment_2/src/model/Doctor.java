/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author shubhamgoyal
 */
public class Doctor extends Person {
        
    private City city;
    
    private Community community;
    
    private Hospital hospital;

    public Doctor(String name, double age, Gender gender,String userID, String password, Date createdDate, City city,Community community,Hospital hospital) {
        super(name, age,  gender, userID,  password, "Doctor", createdDate);
        
        this.city=city;
        this.community=community;
        this.hospital=hospital;
        
    }
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
    
}
