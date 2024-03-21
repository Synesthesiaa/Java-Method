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
    
    public Personn(String name){
        this.name = name;
    
    }
    
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        
        Personn person = new Personn(name);
        System.out.println("Name: " + person.getName());
    }
}
