/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista_01;

import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class Elevador {
    public static void main(String[] args) {
        
        Scanner pesoElevadorMax = new Scanner(System.in);
        Scanner pessoasElevadorMaxi = new Scanner(System.in);
       
        Scanner pessoa1 = new Scanner(System.in);
        Scanner pessoa2 = new Scanner(System.in);
        Scanner pessoa3 = new Scanner(System.in);
        
        System.out.println("Peso maxímo no elevador: ");
        Double pesoElevador = pesoElevadorMax.nextDouble();
         
         System.out.println("Maxímo de pessoas no elevador: ");
        Integer pessoasElevador = pessoasElevadorMaxi.nextInt();
         
         
           System.out.println("Peso da pessoa 1: ");
        Double pessoaPeso1 = pessoa1.nextDouble();
       
         System.out.println("Peso da pessoa 2: ");
        Double pessoaPeso2 = pessoa2.nextDouble();
         
          System.out.println("Peso da pessoa 3: ");
        Double pessoaPeso3 = pessoa3.nextDouble();
        
        Double pesoTotal = pessoaPeso1 + pessoaPeso2 + pessoaPeso3;
         
         
        System.out.println(String.format("\nEntraram 3 pessoas no elevador, no qual cabem %d pessoas. "
                + "\nO peso total no elevador é de %.2f, "
                + "sendo que ele suporta %.2f ",pessoasElevador, pesoTotal,pesoElevador));
  
        
    }
}
