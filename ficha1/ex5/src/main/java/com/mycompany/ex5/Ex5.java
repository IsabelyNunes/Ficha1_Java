/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex5 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        int base, altura, area, perimetro;
        
         System.out.print("Digite a base: ");
        base = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a altura: ");
        altura = Integer.valueOf(input.nextLine());
        
        area = base * altura;
        perimetro = 2 * (base + altura); 
        
        System.out.println("A area eh: "+area);
        System.out.println("A perimetro eh: "+perimetro);
    }
}
