/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, quociente, resto;

        System.out.print("Digite o numero: ");
        numero = Integer.parseInt(input.nextLine());

        quociente = numero / 2;

        resto = numero % 2;

        System.out.println("quociente: " + quociente);
        System.out.println("resto: " + resto);
    }
}
