/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;
// 
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Juan
 */
public class regularExp {
    public static void main(String[]args){
        String line = "This order was placed for QT3000! OK";
        String pattern = "(.*)(\\d+)(.*)";
        
        Pattern r = Pattern.compile(pattern);
        
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println("found value : "+ m.group(0));
            System.out.println("found value : "+ m.group(1));
            System.out.println("found value : "+ m.group(2));
        }
        else{
            System.out.println("NO MAtch");
        
    }
}
}