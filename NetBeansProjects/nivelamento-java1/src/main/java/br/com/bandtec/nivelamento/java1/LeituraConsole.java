/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelamento.java1;

import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class LeituraConsole {
    public static void main(String[] args) {
        
        // exemplo de instancia ou um objeto
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Escreva seu nome:");
        
        String nome = leitor.nextLine();
        
        System.out.println(String.format("Olá %s ", nome)) ;
        
        Scanner leitorNumero = new Scanner (System.in);

        System.out.println("Escreva sua idade:");
        
        Integer idade = leitorNumero.nextInt();
        
        System.out.println("Você nasceu em " + (2021 - idade));
    }
    
}
