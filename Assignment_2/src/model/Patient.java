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
public class Patient extends Person {
    
    private EncounterHistory encounterHistory;
       
    private City city;
    
    private Community community;
    
    private House houseName;

    public Patient(String name, double age, Gender gender,String userID, String password, Date createdDate, EncounterHistory encounterHistory, City city,Community community,House houseName) {
        super(name, age,  gender, userID,  password, "Patient", createdDate);
        this.encounterHistory = encounterHistory;
        this.city=city;
        this.community=community;
        this.houseName=houseName;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
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

    public House getHouseName() {
        return houseName;
    }

    public void setHouseName(House houseName) {
        this.houseName = houseName;
    }
    
    
    
}
