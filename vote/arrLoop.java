/*
 * This program is Coded by BBTAM
 *   * 
 */
package test.vote;


import static com.file.FileIO.choice;
import static com.file.FileIO.scan;
import java.util.*;

/**
 *
 * @author Juan
 */
public class arrLoop {
    
   public static ArrayList<String> pres = new ArrayList<>();
   public static ArrayList<String> vpres = new ArrayList<>();
   public static ArrayList<String> sec = new ArrayList<>();
   public static ArrayList<String> tres = new ArrayList<>();
   public static ArrayList<String> audi = new ArrayList<>();
   public static ArrayList<String> PIO = new ArrayList<>();
   public static String p, vp, s, tr, aud, pio;
   
   
   
    static void vote(){

        System.out.println("President");
        
        Scanner pressc = new Scanner(System.in);
        System.out.print(":: ");
        p = pressc.next();
        pres.add(p);
        
        System.out.println("Vice-President");
        Scanner vpressc = new Scanner(System.in);
        System.out.print(":: ");
        vp = vpressc.next();
        vpres.add(vp);
        
        System.out.println("Secretary");
        Scanner secsc = new Scanner(System.in);
        System.out.print(":: ");
        s = secsc.next();
        sec.add(s);
        
        System.out.println("Treasurer");
        Scanner tressc = new Scanner(System.in);
        System.out.print(":: ");
        tr = tressc.next();
        tres.add(tr);
        
        System.out.println("Auditor");
        Scanner audisc = new Scanner(System.in);
        System.out.print(":: ");
        aud = audisc.next();
        audi.add(aud);
        
        System.out.println("P.I.O");
        Scanner piosc = new Scanner(System.in);
        System.out.print(":: ");
        pio = piosc.next();
        PIO.add(pio);
        
        System.out.println("transaction ended");
    }
    
    static void tally(){
        System.out.println("President Tally");
        Set<String> setp = new HashSet<>(pres);
        for (String r: setp){
            System.out.println(r + " :" + Collections.frequency(pres, r));
        }
        
        System.out.println("Vice-President Tally");
        Set<String> setvp = new HashSet<>(vpres);
        for (String r: setvp){
            System.out.println(r + " :" + Collections.frequency(vpres, r));
        }
        System.out.println("Secretary Tally");
        Set<String> setsec = new HashSet<>(sec);
        for (String r: setsec){
            System.out.println(r + " :" + Collections.frequency(sec, r));
        }
        System.out.println("Treasurer Tally");
        Set<String> settres = new HashSet<>(tres);
        for (String r: settres){
            System.out.println(r + " :" + Collections.frequency(tres, r));
        }
        System.out.println("Auditor Tally");
        Set<String> setaud = new HashSet<>(audi);
        for (String r: setaud){
            System.out.println(r + " :" + Collections.frequency(audi, r));
        }
        System.out.println("PIO Tally");
        Set<String> setpio = new HashSet<>(PIO);
        for (String r: setpio){
            System.out.println(r + " :" + Collections.frequency(PIO, r));
        }
    }
    
    static void option(){
        do{
            System.out.print("\n[1]Vote [2]done \n::>");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    vote();
                    break; 
                case 2:
                    //Edit File Content
                    break;
                    //rename File
                 
            }
        }while(choice !=2);
        System.out.println("Done");
        
        System.out.println("----------------");
        System.out.println("----------------");
//        for(String str:names)
//            System.out.println(str);
        tally();
        
        
    }
    public static void main(String[]args){
         System.out.print("2020 Election");
        option();
    }
    
}
