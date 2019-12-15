/*
 * This program is Coded by BBTAM
 *   * 
 */
package test.vote;

/**
 *
 * @author Juan
 */
import java.util.*;


public class listArr {
    public static void main(String []args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("joy");
        names.add("cocong");
        names.add("joy");
        
        System.out.println(names);
        
        names.add("toto");
        
        System.out.println(names);
        
        names.remove("joy");
        
        System.out.println(names);
        
        for(String str: names)
            System.out.println(str);
        System.out.println("after adding object with index");
        
        names.add(0,"dodong");
        
//        for(String str:names)
//            System.out.println(str);
//        int name = names.indexOf("clint");
        
//        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String n = sc.next();
 
        int namecall = names.indexOf(n);
        
        if(namecall == -1 ){
            System.out.println("Object not fount");
            System.out.println("Adding "+ n + " to the array");
            names.add(n);
        }
        for(String str: names)
            System.out.println(str);
        
        int numofobjects = names.size();
        System.out.println("number of elements: " + numofobjects);
    }
}
