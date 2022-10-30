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
public class House {
    
    private String houseName;
    
    private PatientDirectory patDir;

    public House(String houseName) {
        this.houseName=houseName;
        this.patDir= new PatientDirectory();
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public PatientDirectory getPatDir() {
        return patDir;
    }

    public void setPatDir(PatientDirectory patDir) {
        this.patDir = patDir;
    }
    
    @Override
    public String toString() {
        return houseName;
    }
}
