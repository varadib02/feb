/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

/**
 *
 * @author User
 */
public class Cat extends animal{
    
    private Integer life = 9;
    private Boolean alomkaki;

    public Cat(String name, Integer age, Boolean male) {
        //kötelező meghívni az ősosztályt
        super(name, age, male);
    }

    public Cat() {
        super();
    }

    public Cat(Boolean alomkaki, String name, Integer age, Boolean male) {
        super(name, age, male);
        this.alomkaki = alomkaki;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Boolean getAlomkaki() {
        return alomkaki;
    }

    public void setAlomkaki(Boolean alomkaki) {
        this.alomkaki = alomkaki;
    }
    
    
    
    
}
