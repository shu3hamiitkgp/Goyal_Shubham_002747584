/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shubhamgoyal
 */
import java.awt.Image;
import java.util.Date;
public class EmployeeProfile {
    
    private String Name;
    private Long EmployeeID;
    private int Age;
    private String Gender;
    private Date StartDate;
    private int Level;
    private String TeamInfo;
    private String PositionTitle;
    private Long CellPhoneNumber;
    private String EmailAddress;
    private String PhotoPath;
    //private Image Photo;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Long getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(Long EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public String getTeamInfo() {
        return TeamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.TeamInfo = TeamInfo;
    }

    public String getPositionTitle() {
        return PositionTitle;
    }

    public void setPositionTitle(String PositionTitle) {
        this.PositionTitle = PositionTitle;
    }

    public Long getCellPhoneNumber() {
        return CellPhoneNumber;
    }

    public void setCellPhoneNumber(Long CellPhoneNumber) {
        this.CellPhoneNumber = CellPhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getPhotoPath() {
        return PhotoPath;
    }

    public void setPhotoPath(String PhotoPath) {
        this.PhotoPath = PhotoPath;
    }
    
    //public Image getPhoto() {
    //    return Photo;
    //}

    //public void setPhoto(Image Photo) {
    //    this.Photo = Photo;
    //}

    @Override
    public String toString(){
        return Name;
    }    
    
}
