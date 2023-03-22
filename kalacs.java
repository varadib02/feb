/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

/**
 *
 * @author User
 */
public class kalacs extends gabonafele{
    private Integer fonatszam;

    public kalacs(Integer fonatszam, String name, String tipus, Integer ar, Double suly, String minoseg, String cimke) {
        super(name, tipus, ar, suly, minoseg, cimke);
        this.fonatszam = fonatszam;
    }

    public Integer getFonatszam() {
        return fonatszam;
    }

    public void setFonatszam(Integer fonatszam) {
        this.fonatszam = fonatszam;
    }
    
    
    
    
}
