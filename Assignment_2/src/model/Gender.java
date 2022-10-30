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
public enum Gender {
    
    Male,Female;
    
    public static List<String> getGenderList(){
       
        return Stream.of(Gender.values()).map(Gender::name).collect(Collectors.toList());
    }
    
    public static String[] getGenderArray() {
        
        return Arrays.stream(Gender.values()).map(Gender::name).toArray(String[]::new);
    }
    
}
