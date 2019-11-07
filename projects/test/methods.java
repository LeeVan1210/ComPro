/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;
import java.util.*;
//display minimum number
/**
 *
 * @author Juan
 */
public class methods {
    
    public static Scanner num1 = new Scanner(System.in);
    public static Scanner num2 = new Scanner(System.in);
    public static int a,b;
    static void myMethod(){
        System.out.println("im from method");
    }
    public static int minFunction(int n1, int n2){
        int min;
        if (n1 > n2 )
            min = n2;
        else
            min = n1;
        return min;
    }
    static void minNum(){
        System.out.print("Enter First Number: ");
        a = num1.nextInt();
        System.out.print("Enter Second Number: ");
        b = num2.nextInt();
        int c = minFunction(a,b);
        System.out.println("Minimum value = " + c);
    }
    public static void methodRankPoints(Double points){
        if (points >= 202.5){
            System.out.println("Rank:A1");
        }else if (points >= 122.4){
            System.out.println("Rank:A2");
        }else{
            System.out.println("Rank:A3");
        }
    }
    public static void main (String[]args){
        
//        minNum();
//        myMethod();
//        methodRankPoints(100.7);
    }
}
