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
public class VitalSigns extends ModifInfo{
    
    private double weight;
    
    private double uprBloodPressure;
    
    private double lowBloodPressure;
    
    private double height;
    
    private double Temperate;
    
    private int pulseRate;
    
    private int respirationRate;
    
    private double oxygenSaturation;

    public VitalSigns(double weight, double uprBloodPressure, double lowBloodPressure, double height, double Temperate, int pulseRate, int respirationRate, double oxygenSaturation, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.weight = weight;
        this.uprBloodPressure = uprBloodPressure;
        this.lowBloodPressure = lowBloodPressure;
        this.height = height;
        this.Temperate = Temperate;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.oxygenSaturation = oxygenSaturation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getUprBloodPressure() {
        return uprBloodPressure;
    }

    public void setUprBloodPressure(double uprBloodPressure) {
        this.uprBloodPressure = uprBloodPressure;
    }

    public double getLowBloodPressure() {
        return lowBloodPressure;
    }

    public void setLowBloodPressure(double lowBloodPressure) {
        this.lowBloodPressure = lowBloodPressure;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTemperate() {
        return Temperate;
    }

    public void setTemperate(double Temperate) {
        this.Temperate = Temperate;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(double oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }
    
    
    
    
}
