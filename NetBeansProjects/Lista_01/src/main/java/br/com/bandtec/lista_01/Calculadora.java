/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista_01;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner leitor1 = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
      
        
        System.out.println("Digite um numero");
        Double numero1 = leitor1.nextDouble();
        System.out.println("Digite outro numero");
        Double numero2 = leitor2.nextDouble();
        
        Double soma = numero1 + numero2;
        Double subT = numero1 - numero2;
        Double divS = numero1 / numero2;
        Double multP = numero1 * numero2;
        
        System.out.println("resultado da soma: " + soma);
        System.out.println("resultado da subtração: " + subT);
        System.out.println(String.format("resultado da divisão: %.2f", divS));
        System.out.println("resultado da multiplicação: " + multP);
        
    }
    
}
