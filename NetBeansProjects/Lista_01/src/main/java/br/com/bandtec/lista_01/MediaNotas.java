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
public class MediaNotas {
    public static void main(String[] args) {
        
        Scanner nomeAluno = new Scanner(System.in);
        Scanner notaAluno = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String aluno = nomeAluno.nextLine();
        
        System.out.println("Informe sua primeira nota:");
        Double nota1 = notaAluno.nextDouble();
        
        System.out.println("Informe sua segunda nota:");
        Double nota2 = notaAluno.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("%s sua média foi de: %.1f", aluno,media));
        
        
    }
}
