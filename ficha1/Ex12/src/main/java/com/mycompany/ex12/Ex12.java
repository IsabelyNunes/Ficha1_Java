/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex12 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        float quiloRef, pesoPrato, valor, total;
        
        System.out.println("Digite o peso do prato montado: ");
        pesoPrato = Float.parseFloat(input.nextLine());
        
        valor = (float) (pesoPrato - 0.450);
        total = (float) (valor * 39);
        
        System.out.println("Valor a pagar R$: " +total);
    }
}
