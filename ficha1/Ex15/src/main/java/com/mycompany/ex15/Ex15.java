/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex15;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float peso, engorda, emagrece;
        
        System.out.print("Digite seu peso ");
        peso = Float.parseFloat(input.nextLine());
        
        engorda = (float) (peso * 1.15);
        emagrece = (float) (peso * 0.80);
        
        System.out.println("Peso se engordar: " +engorda);
        System.out.println("Peso se emagrecer: " +emagrece);
    }
}
