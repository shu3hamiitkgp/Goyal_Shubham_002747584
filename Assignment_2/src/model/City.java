/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author shubhamgoyal
 */
public class City {
    
    private String cityName;
    
//    private List<City> cities;
     
    private List<Community> communities;

    public City(String cityName, List<Community> communities) {
        this.cityName=cityName;
        this.communities=communities;
    }
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }    
    
//    public static List<String> getCitiesList(){
       
//        return Stream.of(City.values()).map(CityName::name).collect(Collectors.toList());
//    }
    
//    public static String[] getCitiesArray() {
        
//        return Arrays.stream(CityName.values()).map(CityName::name).toArray(String[]::new);
//    }
    
    @Override
    public String toString() {
        return cityName;
    }
}
