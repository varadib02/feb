/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb;

/**
 *
 * @author User
 */
public class Kutya {
    private String name;
    private Integer age;
    private Boolean male;
    
    private Boolean labda;
    private String owner;

    public Kutya(String name, Integer age, Boolean male, Boolean labda, String owner) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.labda = labda;
        this.owner = owner;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
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
