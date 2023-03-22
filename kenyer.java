/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

//
//enum szin{
//barna,
//sötetbarna,
//vilagosbarna
//}

public class kenyer extends gabonafele{

    private Boolean helya;
    
    //private szin szin;

    public kenyer(Boolean helya, String name, String tipus, Integer ar, Double suly, String minoseg, String cimke) {
        super(name, tipus, ar, suly, minoseg, cimke);
        this.helya = helya;
    }


    public Boolean getHelya() {
        return helya;
    }

    public void setHelya(Boolean helya) {
        this.helya = helya;
    }
    
    
    
    

    
    
    
}
