/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

/**
 *
 * @author User
 */
public abstract class gabonafele {
    protected String name;
    protected String tipus;
    protected Integer ar;
    protected Double suly;
    protected String minoseg;
    protected String cimke;

    public gabonafele(String name, String tipus, Integer ar, Double suly, String minoseg, String cimke) {
        this.name = name;
        this.tipus = tipus;
        this.ar = ar;
        this.suly = suly;
        this.minoseg = minoseg;
        this.cimke = cimke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public Double getSuly() {
        return suly;
    }

    public void setSuly(Double suly) {
        this.suly = suly;
    }

    public String getMinoseg() {
        return minoseg;
    }

    public void setMinoseg(String minoseg) {
        this.minoseg = minoseg;
    }

    public String getCimke() {
        return cimke;
    }

    public void setCimke(String name, Integer ar) {
        if(!name.equals("ujnev") && ar!=0)this.cimke = name+" "+ar+"Ft";
    }
    
    
    
}
