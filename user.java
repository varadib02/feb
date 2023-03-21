/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

public class user {
    public String name;
    private String szemlyigazolvanyszam;
    public user(){
        //this.name = null;
        //this.szemlyigazolvanyszam=null;
        //return this;
    }
    public user(String name){
        this.name=name;
    }
    public user(String name,String szemlyigazolvanyszam){
        this.name=name;
        this.szemlyigazolvanyszam=szemlyigazolvanyszam;
    }
    
    public String getszemlyigazolvanyszam() {
        return szemlyigazolvanyszam;
    }
    public void setszemlyigazolvanyszam(String szemlyigazolvanyszam) {
        this.szemlyigazolvanyszam=szemlyigazolvanyszam;
    }
}
