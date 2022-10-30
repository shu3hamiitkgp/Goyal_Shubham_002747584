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
public class AppSystem extends Person {
    
    public List<City> cities;
    
    public PersonDirectory personDirectory;
    
    public PatientDirectory patientDirectory;
    
    public DoctorDirectory doctorDirectory;

    
    
    public AppSystem(){
//        super();
        this.personDirectory = new PersonDirectory();
        this.patientDirectory=new PatientDirectory(); //add new
        this.doctorDirectory= new DoctorDirectory(); 
    }

    public AppSystem(String name, double age, Gender gender, Date createdDate,List<City> cities,PersonDirectory personDirectory, PatientDirectory patientDirectory,DoctorDirectory doctorDirectory) {
        super(name, age,  gender, "Admin",  "Admin", "System Admin", createdDate);
        this.cities= cities;
        this.personDirectory= new PersonDirectory();
        this.patientDirectory=new PatientDirectory(); //add new
        this.doctorDirectory= new DoctorDirectory(); //add new
        
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    
}
