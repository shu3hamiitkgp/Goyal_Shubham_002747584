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
public class Person {
    
    private String name;
    
    private double age;
    
    private Gender gender;
    
    private String userID;
    
    private String password;
    
    private String role;
    
    private Date createdDate;
        
    public Person() {
        
    }
    public Person(String name, double age, Gender gender,String userID, String password,String role, Date createdDate) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.userID=userID;
        this.password=password;
        this.role=role;
        this.createdDate=createdDate;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserId(String userId) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
