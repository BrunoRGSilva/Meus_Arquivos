/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelamento.java1;

/**
 *
 * @author DOM
 */
public class OperadoreAritimeticos {
    public static void main(String[] args) {
      /*
        Os operadores aritimeticos basicos, são os
        mesmos utilizados no primeiro semestre em Javascript
        + Adição
        - Subtração
        * Multiplicação
        / Divisão
        
        Também funcionam:
        ++ incremento ( variavel = variavel + 1 )
        -- decremento ( variavel = variavel - 1 )
        +=
        -=
        *=
        /=
     */ // Considerando o preço fixo de 4,40
     
      String nome = "Chicó";
      Double saldo = 200.0;
      
      Double totalPassagens = saldo / 4.40;
      
      Integer totalPassagensInteiro = totalPassagens.intValue();
      
      System.out.println("Passagens: " + totalPassagens);
              
    }
}
