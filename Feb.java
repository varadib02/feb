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
        System.out.println("Hány kört szeretne játszani?: ");
        Scanner match = new Scanner(System.in);
        int hossz=match.nextInt();
        int gepW=0;
        int teW=0;
        int draw=0;
        for (int i = 0; i < hossz; i++) {
            int max =4;
            int min =1;
            int range = max-min+1;
            int gep = (int)(Math.random() * range) + min;
            System.out.println((i+1)+". Kör a Tipped (1-3): ");
            Scanner bekert = new Scanner(System.in);
            int bekeres=bekert.nextInt();
            Feb.kopapirollo();
            bekert.close(gepW,teW,draw,gep,bekeres);
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
    public  static void kopapirollo(int gepW,int teW,int draw,int gep,int bekeres){
        
            
            if((bekeres==1 && gep==3)||(bekeres==2 && gep==1)||(bekeres==3 && gep==2)){
                System.out.println("Nyertél");
                teW++;
            }
            else if((bekeres==3 && gep==1)||(bekeres==1 && gep==2)||(bekeres==2 && gep==3)){
                System.out.println("A gép nyert");
                gepW++;
            }
            else{
                System.out.println("Döntetlen");
                draw++;
            }
            
            
        
        
        if(teW>gepW)  System.out.println("A játék győztese tehát te vagy.");
        else if(teW<gepW) System.out.println("A játék győztese tehát a gép.");
        else System.out.println("A játéknak nincs győztese.");
        
        System.out.println("Te nyertél: "+teW+", Gép nyert: "+gepW+", Döntetlen: "+draw);
    
    }
    
}
