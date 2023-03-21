/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package feb;

import java.util.Random;
import java.util.Scanner;

public class dolgozat03_01 {
    public static void main(String args[]) {
        //1. feladat
        int [] lottoSzamok = new int [5];
        int [] kisorsoltSzamok = new int [5];
        Random r = new Random();
        for (int i = 0; i < lottoSzamok.length; i++) {
            int randomSzam=r.nextInt(1,91);
            while (vaneIlyen(kisorsoltSzamok,randomSzam)==true) {
                randomSzam=r.nextInt(1,91);}
            kisorsoltSzamok[i]=randomSzam;
            lottoSzamok[i]=randomSzam;
        }
        for (int i = 0; i < 5; i++) System.out.println(lottoSzamok[i]);
        //2. feladat
        int [] tippekTomb=bekeres();
        //for (int i = 0; i < 5; i++) System.out.println(tippekTomb[i]);
        //3. feladat
        int talalatok=oszehasonlitas(tippekTomb, lottoSzamok);
        System.out.println("TALÁLATOK SZÁMA: "+talalatok);
        //4.feladat
        System.out.println("Hány Szelvényt szertne kitölteni (1-3):");
        int szelvenyek=hanyszor();
        int [] tippekTomb1=new int[5];
        int [] tippekTomb2=new int[5];
        int [] tippekTomb3=new int[5];
        if(szelvenyek<=1){
            tippekTomb1=bekeres();
            System.out.println("1. Szelvény Találatok Száma: "+oszehasonlitas(tippekTomb1, lottoSzamok));
        }
        else if(szelvenyek<=2){
        tippekTomb1=bekeres();
        tippekTomb2=bekeres();
        System.out.println("1. Szelvény Találatok Száma: "+oszehasonlitas(tippekTomb1, lottoSzamok));
        System.out.println("2. Szelvény Találatok Száma: "+oszehasonlitas(tippekTomb2, lottoSzamok));
        }
        else{
            tippekTomb1=bekeres();
            tippekTomb2=bekeres();
            tippekTomb3=bekeres();
        System.out.println("1. Szelvény Találatok Száma: "+oszehasonlitas(tippekTomb1, lottoSzamok));
        System.out.println("2. Szelvény Találatok Száma: "+oszehasonlitas(tippekTomb2, lottoSzamok));
        System.out.println("3. Szelvény Találatok Száma: "+oszehasonlitas(tippekTomb3, lottoSzamok));
        } 
    }
    public static Boolean vaneIlyen(int [] szamok,int rSzam){
        for (int i = 0; i < szamok.length; i++) {
            if(rSzam==szamok[i])return true;
        }
        return false;
    }
    public static int[] bekeres(){
        Scanner bekeres = new Scanner(System.in);
        int [] felhasználoTipp = new int [5];
        int [] bekertTipp = new int [5];
        for (int i = 0; i < 5; i++) {
            int tippSzam=bekeres.nextInt();
            while (vaneIlyen(bekertTipp,tippSzam)==true && tippSzam>1 && tippSzam<90) {
                tippSzam=bekeres.nextInt();}
            bekertTipp[i]=tippSzam;
            felhasználoTipp[i]=tippSzam;}
        return felhasználoTipp;
    }
    public static int oszehasonlitas(int [] a ,int [] b){
        int x=0;
        for (int i = 0; i < 5; i++) {
            if(a[i]==b[i])x++;
        }
    return x;
    }
    public static int hanyszor(){
        Scanner bekeres = new Scanner(System.in);
        int hanyszorFussonLe=bekeres.nextInt();
        while(hanyszorFussonLe>3 && hanyszorFussonLe<1){
            hanyszorFussonLe=bekeres.nextInt();}
        return hanyszorFussonLe;
    }
    
 } 
        

    

