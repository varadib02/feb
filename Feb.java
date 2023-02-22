/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feb;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/**
 *
 * @author User
 */
public class Feb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Feb.osszeadas(10.1, 5.2));
        
        
        Double szam1 = 5.0;
        Double szam2 = 5.0;
        
        double szam3=3.0;
        double szam4=1.5;
        
        /*
        System.out.println(Feb.osszeadas(szam1,szam2,szam3));
        Scanner muv = new Scanner(System.in);
        String muvelet=muv.next();
        System.out.println(Feb.szamologep(szam1,szam2,muvelet));
        muv.close();
        */
        
        //kopapirollo
        Scanner x = new Scanner(System.in);
                    Integer korok;
            System.out.println("Hány kört szeretnél játszani: ");
            korok = x.nextInt();
            
            Integer userValasz;
            int kor = 0;
            String sValasz;
            for(int i = 0; i < korok; i++){
                System.out.println(i+1+ ". kör");
                
                boolean igazE;
                do{
                System.out.println("Írd be a választásod Kő(1), Papír(2), Olló(3): ");
                Scanner tipp = new Scanner(System.in);
                
                userValasz = tipp.nextInt();
                sValasz = tipp.next();
                igazE = szame(userValasz);
                }while (igazE!=true);                
                    
                
                System.out.println("User választása: " + userValasz); 
                
                int min = 1;
                int max = 3;
                int rand = (int)(Math.random()*(max-min+1)+min);  
                System.out.println("Gép mutat: " + rand);
                
                System.out.println(Feb.kopapirollo(korok, userValasz, rand));
            }
        
    }

    //Acces modifier
    //public,private ...
    //meghívás modja static vagy semmi
    //visszatérési érték típusa
    //függvény neve, bemenő paraméterek
    //függvény body
    
    public static Double osszeadas(Double a,Double b){
        return a+b;
    }
    public static Double osszeadas(Double a,Double b,Double c){
        return a+b+c;
    }
    public  static Double szamologep(Double a,Double b,String muvelet){
        if(muvelet.equals("+")) {
            return a+b;
        }
        else if(muvelet.equals("-")){
            return a-b;
        }
        else if(muvelet.equals("*")) {
            return a*b;
        }
        else if(muvelet.equals("/")){
            return a/b;
        }
        else{
            return -1.0;
        }
    }
    public static String kopapirollo(Integer korok,Integer userValasz, Integer rand){
            if(rand == userValasz){
                return String.format("Döntetlen!");
            }
            else if(rand==0 && userValasz==1 || rand==1 && userValasz==2 || rand==2 && userValasz==0){
                return String.format("User nyert!");
            } else{
                return String.format("Gép nyert!");
            }
    }
    public static Boolean szame(int x){
        
        if(x>=1 && x<=3){
            return true;
        }
        else return false;
        
    }
    
    
}
