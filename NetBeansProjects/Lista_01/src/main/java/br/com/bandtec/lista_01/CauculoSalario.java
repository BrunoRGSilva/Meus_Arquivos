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
public class CauculoSalario {
    public static void main(String[] args) {
        
        Scanner valorSalario = new Scanner (System.in);
        
        System.out.println("Informe seu salario:");
        Double numUnitario = valorSalario.nextDouble();

        System.out.println("Informe o imposto:");
        Double numImposto = valorSalario.nextDouble();

        Double imposto = numUnitario - (numImposto / 100 )*numUnitario;
        
        System.out.println("O salario líquido será:" + imposto);


 
    }
}
