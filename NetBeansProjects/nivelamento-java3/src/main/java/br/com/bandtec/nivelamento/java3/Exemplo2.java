/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelamento.java3;

import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class Exemplo2 {

    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.println("Insira a primeira nota:\n");
        Double notaAluno = nota.nextDouble();
        System.out.println("Insira a segunda nota:\n");
        Double notaAluno2 = nota.nextDouble();
        System.out.println(String.format("\nAs suas notas foram:\n"
                + "nota 1 %.1f\nnota 2 %.1f", notaAluno, notaAluno2));
        media(notaAluno, notaAluno2);
    }

    static void media(Double valor1, Double valor2) {
        Double mediaAluno;
        mediaAluno = (valor2 + valor1) / 2;
        
        if (mediaAluno >= 6.0 && mediaAluno <= 10.0) {
            System.out.println(String.format("Aprovado! sua média foi %.1f",
                    mediaAluno));
        } else if (mediaAluno > 0.0 && mediaAluno <= 5.9) {
            System.out.println(String.format("Reprovado! sua média foi %.1f",
                    mediaAluno));
        }

    }
    
    
}
