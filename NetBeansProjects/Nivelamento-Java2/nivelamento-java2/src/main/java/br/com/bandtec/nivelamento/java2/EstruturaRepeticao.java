
package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;

public class EstruturaRepeticao {
 
    public static void main(String[] args) {
        
        System.out.println("----- Exemplo 01: for -----");
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("Contador: %d", i));
        }
        
        System.out.println("----- Exemplo 02: for -----");
        
        for (int i = 10; i >= 0; i--) {
            System.out.println(String.format("Contador: %d", i));
        }
        
        System.out.println("----- Exemplo 03: while -----");
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Advinhe o número:");
        Integer numero = leitorNumero.nextInt();
        
        while(numero != 42){
            System.out.println("Número errado, tente novamente...");
            numero = leitorNumero.nextInt();
        }
        
        System.out.println("Parábens acertou!");
        
        System.out.println("----- Exemplo 04: while -----");
        
        numero = 0;
        
        while(numero <= 10){
            System.out.println(String.format("Contador: %d", numero));
            numero++;
        }
        
        System.out.println("----- Exemplo 05: while -----");
        
        numero = 10;
        
        while(numero >= 0){
            System.out.println(String.format("Contador: %d", numero));
            numero--;
        }
        
        System.out.println("----- Exemplo 06: while -----");
       
        do {            
            System.out.println("Digite um número:");
            numero = leitorNumero.nextInt();
        } while (numero != 42);
    }
}
