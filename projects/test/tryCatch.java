/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class tryCatch { //with method
    
    public static int a,b,ans,bool,n,ret;
    
    public static Scanner input = new Scanner(System.in);
    public static Scanner num1 = new Scanner(System.in);
    public static Scanner num2 = new Scanner(System.in);
    public static Scanner in = new Scanner(System.in);
    public static Scanner balik = new Scanner(System.in);
            
    static void add(){
                     System.out.print("Enter First Number: ");
                     a = num1.nextInt();
                     System.out.print("Enter second Number: ");
                     b = num2.nextInt();
                     ans = b+a;
                     System.out.println("the Sum is :" + ans);       
                     
    }
    static void sub(){
                     System.out.print("Enter First Number: ");
                     a = num1.nextInt();
                     System.out.print("Enter second Number: ");
                     b = num2.nextInt();
                     System.out.println(a-b);
    }
    static void doWhile(){
        do{
             System.out.print("1 For Addition \n2 for Subtraction \n::");
             n = input.nextInt();
             switch(n){
                 case 1:
                     add();
                     break;
                 case 2:
                     sub();
                     break;       
             }
             System.out.print("new transaction? \n[1]YES/[0]NO \n:: ");
             bool = in.nextInt();
         }while(bool == 1);
    }
    static void tryCatch(){                         // this is a method
        try {
             doWhile();
         }
         catch(Exception e){
             System.out.println("samting went wong");
//             System.out.print("try again? press ENTER");

//             tryCatch();
         }
        
    }
    
     public static void main(String[]args){        
        
//         do{
             tryCatch();
//             System.out.print("again? \n[1]YES/[0]NO \n:: ");
//             ret = balik.nextInt();
        
//         }
//         while(ret == 1);
         
         
        
    }
    
}
