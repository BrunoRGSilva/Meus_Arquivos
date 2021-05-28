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
public class Idade {
    public static void main(String[] args) {
        
        
        Scanner usuarioNome = new Scanner(System.in);
        Scanner anoNascimento = new Scanner(System.in);
        
        System.out.println("Insira seu nome: ");
        String nome = usuarioNome.nextLine();
        System.out.println("Olá " + nome + " Qual o seu ano de nascimento? ");
        Integer nascimento = anoNascimento.nextInt();
        System.out.println("Em 2030 você terá " + (2030 - nascimento) + " anos de idade.");
        
        
    }
}
