/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       int horas, minutos, segundos, segundosTotais;
       
       System.out.print("Digite as horas ");
        horas = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite os minutos ");
        minutos = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite os segundos ");
        segundos = Integer.parseInt(input.nextLine());
        
        segundosTotais = 86400 - (horas * 3600) + (minutos * 60) + segundos;
        
        System.out.println("faltam " + segundosTotais + " segundos para acabar o dia");
        
        
    }
    
}
