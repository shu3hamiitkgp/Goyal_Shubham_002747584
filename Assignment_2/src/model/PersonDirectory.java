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
public class PersonDirectory {
    
    private List<Person> persons;
    
    public PersonDirectory(){
        this.persons= new ArrayList<Person>();
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    
    public Person searchUserIDProfile(String UserID){
        
        for(Person pr : this.persons){
            if(String.valueOf(pr.getUserID()).equals(UserID)){
                return pr;
            }
        }
        return null;
    }
    
}
