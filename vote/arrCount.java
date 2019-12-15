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
public class arrCount {
    public static void main(String [] args){
        ArrayList<String> names = new ArrayList<>();
        
        System.out.println("President");
        Scanner pressc = new Scanner(System.in);
        System.out.println("Add Element:  ");
        String p = pressc.next();
        names.add(p);
        
        System.out.println("Vice-President");
        Scanner vpressc = new Scanner(System.in);
        System.out.println("Add Element:  ");
        String vp = vpressc.next();
        names.add(vp);
        
        
        System.out.println("----------------");
        System.out.println("----------------");
        for(String str:names)
            System.out.println(str);
        
        
    }
}
