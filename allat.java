/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feb;

/**
 *
 * @author User
 */
public class allat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat macska=new Cat();
        Macska macska2=new Macska("cica",22,true,true);
        try{
        macska2.birthday();
        macska2.birthday();
        macska2.birthday();
        macska2.birthday();
        macska2.birthday();
        macska2.birthday();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
