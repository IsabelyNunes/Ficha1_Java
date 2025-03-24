/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int salMinimo, quantVendida, valorVendas, totalSalario;
        
        System.out.print("Digite o salario minimo: ");
        salMinimo = Integer.valueOf(input.nextLine());
        
         System.out.print("Digite a quatidade vendida: ");
        quantVendida = Integer.valueOf(input.nextLine());
        
         System.out.print("Digite o valor das vendas: ");
        valorVendas = Integer.valueOf(input.nextLine());
        
        totalSalario = (int) (float) (2 * salMinimo + quantVendida * 150 + valorVendas * 0.05);
        
        System.out.println("Total do salario: "+totalSalario);
    }
}
