/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author Administrator
 */  

import java.util.Scanner;
public class Mavenproject4 {
    public static int max(int a, int b){
        return (a > b) ? a : b;
    
    }

    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);

        System.out.println("Enter Number 1:");
        int num1 = scan.nextInt();
        
        System.out.println("Enter Number 2:");
        int num2 = scan.nextInt();
        
        int maxNumber = max(num1, num2);
        System.out.println("Maximum number between " + num1 + "and " + num2 + "is:" + maxNumber);
    }
}
