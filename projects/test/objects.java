/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author Juan
 */
public class objects {
    String fname = "John";   
    String lname = "Doe";
    int age = 26;
    public static objects myobj = new objects(); //global scanner variable
    
    public void name(){ //object name
        System.out.println("Name: "+ myobj.fname+ " "+ myobj.lname);
    }
    public void age(){
        System.out.println("Age: "+ myobj.age);
    }
    
    public static void main(String[]args){
        
        myobj.name();
        myobj.age();
        
    }  
}
