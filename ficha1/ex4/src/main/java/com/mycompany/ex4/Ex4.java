/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, sq, resultadoSoma;
        
        System.out.print("Digite a primeira entrada: ");
        a = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a segunda entrada: ");
        b = Integer.valueOf(input.nextLine());
        
        sq = a + b;
        resultadoSoma = sq * sq;
                
        System.out.println("o quadrado da soma destes numeros eh: "+resultadoSoma);
    }
}
