/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feb;


public class oop {

    
    public static void main(String[] args) {
        /*
        Integer szam=12;
        szam=182334;
        
        System.out.println(szam);
        */
        user u = new user();
        u.name="alma";
        System.out.println(u.name);
        u.setszemlyigazolvanyszam("122");
        System.out.println(u.getszemlyigazolvanyszam());
        
        user u2 = new user("Peti");
        System.out.println(u2.name);
        System.out.println(u2.getszemlyigazolvanyszam());
        
        user u3 = new user("István","123B");
        System.out.println(u3.name);
        System.out.println(u3.getszemlyigazolvanyszam());
    }
    
}
