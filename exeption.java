/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feb;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class exeption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] szamok={1,2,3};
        Integer a = null;
        try {
            System.out.println(szamok[0]);
            //a++;
        }
        catch(ArrayIndexOutOfBoundsException ex){
        System.out.println("túl indxeltem");
        }
        catch(NullPointerException ex){
        System.out.println("nullértékre hivatkoztam");
        }
        catch(Exception ex){
        System.out.println("egyéb hiba volt");
        }
        finally{
            System.out.println("ez akkor is le fut");
        }
        
        try {
            exeption.fuggveny(a);
        } catch (Exception ex) {
            
        }
        
    }
    public static Integer fuggveny(Integer szam) throws Exception{
        if (szam>=10) {
            return szam++;
        }
        else{
            throw new Exception();
        }
    }
    
}
