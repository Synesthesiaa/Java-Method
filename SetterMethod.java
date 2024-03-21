/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personnn;

/**
 *
 * @author Administrator
 */
public class Personnn {
    
    private String name;
    private int age;
    
    public Personnn(String name, int age) {
        this.name = name;
        this.age = age;
    
    }
    
    public void setResult(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Personnn person = new Personnn("John", 19);
        System.out.println("Original Name: " + person.getName() + ", Original Age: " + person.getAge());
        
        person.setResult("Alice", 19);
        System.out.println("Modified Name: " + person.getName() + ", Modified Age: " + person.getAge());
     
    }
}
