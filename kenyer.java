/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

/**
 *
 * @author User
 */
public class kenyer {
    private String name;
    private String tipus;
    private String szin;
    private Integer ar;
    private Integer db;
    private Double suly;
    private String minoseg;
    public String cimke;
    private Boolean valtozas;

    public kenyer() {
        this.name = null;
        this.tipus = null;
        this.szin = null;
        this.ar = null;
        this.db = null;
        this.suly = null;
        this.minoseg = null;
        this.cimke = null;
        this.valtozas=false;
    }
    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        this.valtozas=true;
    }
    //ar
    public Integer getAr() {
        return ar;
    }
    public void setAr(Integer ar) {
        this.ar = ar;
        this.valtozas=true;
    }
    //db
    public Integer getDb() {
        return db;
    }
    public void setDb(Integer db) {
        this.db = db;
        this.valtozas=true;
    }
    //suly
    public Double getSuly() {
        return suly;
    }
    public void setSuly(Double suly) {
        if(suly<=1 && suly>=0.5){
            this.suly = suly;
            this.valtozas=true;
        }
    }
    //cimke
    public String getcimke() {
        return cimke;
    }
    public void setCimke(String name,Integer ar) {
        this.cimke = name+" "+ar+"Ft";
    }
    
}
