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
public class Patient extends ModifInfo {
    
    private EncounterHistory encounterHistory;
    
    private Person person;
    
    private City city;
    
    private Community community;
    
    private House houseName;

    public Patient(EncounterHistory encounterHistory, Person person, City city,Community community,House houseName, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.encounterHistory = encounterHistory;
        this.person=person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
