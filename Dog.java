/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

/**
 *
 * @author User
 */
public class Dog extends animal{
    private Boolean labda;
    private String owner;

    public Dog(String name, Integer age, Boolean male) {
        super(name, age, male);
    }

    public Dog(Boolean labda, String owner) {
        this.labda = labda;
        this.owner = owner;
    }

    public Boolean getLabda() {
        return labda;
    }

    public void setLabda(Boolean labda) {
        this.labda = labda;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
    
    
}
