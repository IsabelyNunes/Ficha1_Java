/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex6 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
       float tempCelsius, conversao;
       
       System.out.print("Digite a temperatura em celsius: ");
        tempCelsius = Float.parseFloat(input.nextLine());
        
        conversao = (float) ((tempCelsius * 1.8) + 32);
        
        System.out.println("temperatura em fahrenheit: "+conversao);
    }
}
