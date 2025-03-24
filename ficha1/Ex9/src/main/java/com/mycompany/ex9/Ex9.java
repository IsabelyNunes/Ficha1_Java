/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex9;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int QCafe, LLeite, BBolacha;
        float CCafe, CLeite, CBolacha;
        float GCafe, GLeite, GBolacha, GTotal;

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = input.nextLine();

        System.out.print("Digite a quantidade de cafe: ");
        QCafe = Integer.parseInt(input.nextLine());

        System.out.print("Digite o valor do cafe: ");
        CCafe = Float.parseFloat(input.nextLine());

        System.out.print("Digite a quantidade de leite: ");
        LLeite = Integer.parseInt(input.nextLine());

        System.out.print("Digite o valor do leite: ");
        CLeite = Float.parseFloat(input.nextLine());

        System.out.print("Digite a quantidade de bolachas: ");
        BBolacha = Integer.parseInt(input.nextLine());

        System.out.print("Digite o valor das bolachas: ");
        CBolacha = Float.parseFloat(input.nextLine());


        GCafe = QCafe * CCafe;
        GLeite = LLeite * CLeite;
        GBolacha = BBolacha * CBolacha;
        GTotal = GCafe + GLeite + GBolacha;


        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Total gasto com café: "+GCafe);
        System.out.println("Total gasto com leite: "+GLeite);
        System.out.println("Total gasto com bolacha: "+GBolacha);
        System.out.println("Total da compra: "+GTotal);

    }
}
