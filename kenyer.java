/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;


enum szin{
barna,
sötetbarna,
vilagosbarna
}

public class kenyer {
    private String name;
    private String tipus;
    private szin szin;
    private Integer ar;
    private Double suly;
    private String minoseg;
    public String cimke;

    public kenyer(String name, String tipus, szin szin, Integer ar, Double suly, String minoseg, String cimke) {
        this.name = name;
        this.tipus = tipus;
        this.szin = szin;
        this.ar = ar;
        this.suly = suly;
        this.minoseg = minoseg;
        this.cimke = cimke;
    }

    
    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //ar
    public Integer getAr() {
        return ar;
    }
    public void setAr(Integer ar) {
        this.ar = ar;
    }
    //suly
    public Double getSuly() {
        return suly;
    }
    public void setSuly(Double suly) {
        if(suly<=1 && suly>=0.5){
            this.suly = suly;
        }
    }
    //cimke
    public String getcimke() {
        return cimke;
    }
    public void setCimke(String name,Integer ar) {
        if(!name.equals("ujnev") && ar!=0)this.cimke = name+" "+ar+"Ft";
    }
    
    
}
