/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, sq;
        
        System.out.print("Digite a primeira entrada: ");
        a = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a segunda entrada: ");
        b = Integer.valueOf(input.nextLine());
        
        sq = (a*a)+(b*b);
        
        System.out.println("A soma do quadrdao destes numeros eh: "+sq);
        
        
        
        
    }
}
