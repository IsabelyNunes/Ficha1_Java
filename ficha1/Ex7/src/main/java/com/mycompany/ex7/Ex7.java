/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex7;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex7 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
       int Qtipo1, Qtipo2, Qtipo3 ;
       float Vtipo1, Vtipo2, Vtipo3, VTotal;
       
        System.out.print("Digite a quantidade de picoles Tipo1: ");
        Qtipo1 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de picoles Tipo2: ");
        Qtipo2 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de picoles Tipo3: ");
        Qtipo3 = Integer.valueOf(input.nextLine());
        
        Vtipo1 = (float) (Qtipo1 * 1.50) ;
        Vtipo2 = (float) (Qtipo2 * 2.00) ;
        Vtipo3 = (float) (Qtipo3 * 0.75) ;
        
        VTotal = Vtipo1 + Vtipo2 + Vtipo3;
        
         System.out.println("Total Picoles Tipo1: "+Vtipo1);
         System.out.println("Total Picoles Tipo2: "+Vtipo2);
         System.out.println("Total Picoles Tipo3: "+Vtipo3);
         
         System.out.println("Total Picoles em geral: "+VTotal);
         
    }
}
