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
public class EstruturaSelecao {
    public static void main(String[] args) {
        
       // int = representa somente o valor numerico
        
        Scanner nome = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
       
        System.out.println("Digite um numero entre 1 a 7");
        
        Integer numeroDigitado = leitorNumero.nextInt();
        
        switch (numeroDigitado) {
            case 1:
                System.out.println("Domingão");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:System.out.println("Número Invalido");
                break;
        }
        
        System.out.println("Digite um nome");
        String nomeDigitado = nome.nextLine();
                
        switch (nomeDigitado){
        
            case "primeiro":
                System.out.println("MacBook Pro");
                
            case "Segundo":
                System.out.println("Iphone 12");
      
            case "Terceiro":
                System.out.println("Ipod");
                break;
                default:System.out.println("Não ganhou");
        }
    }
}
