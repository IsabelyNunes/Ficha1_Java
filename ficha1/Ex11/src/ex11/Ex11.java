/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int segundos, duracao, horas, minutos, resto, segundos2;
       
       System.out.print("Digite os segundos ");
        segundos = Integer.parseInt(input.nextLine());
        
        //horas
        horas = (segundos / 3600);
        
        //resto dos segundos
        resto = (segundos % 3600);
        
        //minutos
        minutos = resto / 60;
        
        //segundos2 que vao ser exbidos no resultado
        segundos2 = resto % 60;
        
        System.out.print(horas+"H ");
        System.out.print(minutos+"M ");
        System.out.println(segundos2+"S ");
    }
    
}
