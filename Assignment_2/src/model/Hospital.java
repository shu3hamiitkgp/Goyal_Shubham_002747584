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
public class Hospital {
    
    private String hospitalName;
    
    private DoctorDirectory docDir;
    

    public Hospital(String hospitalName) {
        
        this.hospitalName=hospitalName;
        docDir=new DoctorDirectory();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public DoctorDirectory getDocDir() {
        return docDir;
    }

    public void setDocDir(DoctorDirectory docDir) {
        this.docDir = docDir;
    }
    
    @Override
    public String toString() {
        return hospitalName;
    }
    
}
