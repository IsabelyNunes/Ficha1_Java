/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex16;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float salarioJoao, c1, c2, sobraSalario, multa1, multa2, multaCalculada;
        
        salarioJoao = 1500.00f;
        c1 = 200.00f;
        c2 = 120.00f;
        
        multa1 = 200 * 0.02f;
        multa2 = 120 * 0.02f;
        
        multaCalculada = (c1 + multa1) + (c2 + multa2) ;
        
        sobraSalario = salarioJoao - multaCalculada;
        
         System.out.println("restara: " +sobraSalario);
    }
    
}
