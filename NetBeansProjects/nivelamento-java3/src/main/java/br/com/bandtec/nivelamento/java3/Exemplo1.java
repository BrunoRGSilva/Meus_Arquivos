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
public class Exemplo1 {

    public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        String nomeAluno = nome.nextLine();
        
        
        exibeLinha();
        System.out.println(nomeAluno);
        exibeLinha();

    }

    //Exemplo de método sem retorno e sem argumentos
    static void exibeLinha() {
        System.out.println("**********************************");
    }

}
