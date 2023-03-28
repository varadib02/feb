/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

/**
 *
 * @author User
 */
public class Macska {
    private String name;
    private Integer age;
    private Boolean male;
    
    //private final Integer life = 9;
    private Integer life = 9;
    private Boolean alomkaki;

    public Macska(String name, Integer age, Boolean male, Boolean alomkaki) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.alomkaki = alomkaki;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void birthday(Integer age)throws TooOldException{
        if(this.age>=25){
        this.age ++;    
        }
        else{
        throw new TooOldException("Ez a macska túl öreg");
        }
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
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

    void birthday() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
