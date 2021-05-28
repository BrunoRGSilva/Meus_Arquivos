/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelament.java2;

import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class EstruturaRepeticao {

    public static void main(String[] args) {

        System.out.println("----- Exemplo 01: for -----");

        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Contador1: %d", i));
        }
        System.out.println("----- Exemplo 2 -----");

        for (int i = 10; i >= 0; i--) {
            System.out.println(String.format("Contador2: %d", i));
        }
        System.out.println("----- Exemplo 3 -----");

        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Contador3: %d", i));
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Acerte o numero secreto");

        Integer leitorNumero = leitor.nextInt();

        while (leitorNumero != 42) {
            System.out.println("Numero errado, tente novamente...");
            leitorNumero = leitor.nextInt();
        }
        System.out.println("Parapens você acertou o numero");

        leitorNumero = 0;

        do {
            System.out.println("Digite um numero");
            leitorNumero = leitor.nextInt();

        } while (leitorNumero != 42);

    }

}
