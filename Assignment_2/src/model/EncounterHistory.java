/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author shubhamgoyal
 */
public class EncounterHistory {
    
    private List<Encounter> encounters;
    
    public EncounterHistory(){
        this.encounters= new ArrayList<Encounter>();
    }
    
    
    public EncounterHistory(List<Encounter> encounters){
        this.encounters= encounters;
    }

    public List<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(List<Encounter> encounters) {
        this.encounters = encounters;
    }
    
}
