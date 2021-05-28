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
public class EstruturaDeDecisao {
    public static void main(String[] args) {
        
     Integer numeroTeste = 42;
     
        if (numeroTeste < 50) {
            System.out.println("È menor que 50"); 
        }else{
            System.out.println("È maior que 50");
        }
        
        Boolean ligado = true;
        
        // ! -> representa "not"
        
        if (ligado) {
            System.out.println("Esta ligado");
        } else {
            System.out.println("Esta desligado");
        }
      
        
        String nome = "Bruno";
        
        // NÃO COMPARE TEXTOS UTILIZANDO == OU !=
        
        if (nome.equals("Bruno")){
            System.out.println("É igual. ");
        } else {
           System.out.println("É Diferente.");

        }
       
    }
}
