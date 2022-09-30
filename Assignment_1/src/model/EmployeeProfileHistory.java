/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shubhamgoyal
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> history;
    
    public EmployeeProfileHistory(){
        
        this.history= new ArrayList<EmployeeProfile>();
    }

    public <any> getHistory() {
        return history;
    }

    public void setHistory(<any> history) {
        this.history = history;
    }
    
}
