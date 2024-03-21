/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author Administrator
 */

import java.util.Scanner;
public class Rectangle {
    private int length;
    private int width;
    
    public Rectangle() {   
        length = 0;
        width = 0;
    }  
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public void displayArea() {
        int area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Rectangle1:  ");
        int num1 = scan.nextInt();
        
        System.out.println("Enter Rectangle2:  ");
        int num2 = scan.nextInt();
        
     
        Rectangle rectangle1 = new Rectangle(num1, num2);
        rectangle1.displayArea();
        
        
         System.out.println("Enter Rectangle3:  ");
        int num3 = scan.nextInt();
        
        System.out.println("Enter Rectangle4:  ");
        int num4 = scan.nextInt();
        
        
        Rectangle rectangle2 = new Rectangle(num3, num4);
        rectangle2.displayArea();
    }
    }

            
    

    
    
    
