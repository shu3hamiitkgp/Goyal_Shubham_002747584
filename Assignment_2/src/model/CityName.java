/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author shubhamgoyal
 */

public enum CityName {
    Boston,NewYork;
    
    public static List<String> getCitiesList(){
       
        return Stream.of(CityName.values()).map(CityName::name).collect(Collectors.toList());
    }
    
    public static String[] getCitiesArray() {
        
        return Arrays.stream(CityName.values()).map(CityName::name).toArray(String[]::new);
    }

}
