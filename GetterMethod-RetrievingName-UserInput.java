/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personn;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Personn {
    private String name;
    private int age;
    
    public Personn(String name, int age){
        this.name = name;
        this.age = age;
    
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        
        System.out.println("Enter Age: ");
        int age = scan.nextInt();
        
        Personn person = new Personn(name, age);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
