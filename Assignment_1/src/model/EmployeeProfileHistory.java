/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author shubhamgoyal
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> history;
    
    public EmployeeProfileHistory(){
        
        this.history= new ArrayList<EmployeeProfile>();
    }

    public ArrayList<EmployeeProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeProfile> history) {
        this.history = history;
    }
    
    public EmployeeProfile addNewProfile(){
        
        EmployeeProfile newProfile = new EmployeeProfile();
        history.add(newProfile);
        return newProfile;
        
    }
    
    public void deleteProfile(EmployeeProfile ep){
        history.remove(ep);
    }
    
    public EmployeeProfile searchNameProfile(String name){
        
        for(EmployeeProfile ep : this.history){
            if((ep.getName().toLowerCase()).contains(name.toLowerCase())){
                return ep;
            }
        }
        return null;
    }
    
    public EmployeeProfile searchEmployeeIDProfile(String EmployeeID){
        
        for(EmployeeProfile ep : this.history){
            if(String.valueOf(ep.getEmployeeID()).equals(EmployeeID)){
                return ep;
            }
        }
        return null;
    }
    
   
}
