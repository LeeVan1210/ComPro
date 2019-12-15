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

public class arrCountTest {
    public static void main(String []args){
        
        do{
        ArrayList<String> names = new ArrayList<String>();
//        names.add("joy");
//        names.add("cocong");
//        names.add("joy");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :");;
        String in = sc.next();
        names.add(0,in);
        
        HashSet<String> hs = new HashSet<String>();
//       for(String r: names){
//           System.out.println(r + " : "+ Collections.frequency(names, r));
//       }
        System.out.println(names);
        }while(true);
    }
}
