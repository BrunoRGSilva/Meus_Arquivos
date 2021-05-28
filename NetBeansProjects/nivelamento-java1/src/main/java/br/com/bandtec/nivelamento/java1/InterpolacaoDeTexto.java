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
public class InterpolacaoDeTexto {
    public static void main(String[] args) {
        
        String nome = "Bruno";
        String sobreNome = "Ricardo";
        Integer idade = 27;
        Double preco = 22.8588888;  
        
        String frase = String.format("Nome: %s e idade: %d", nome, idade);
        /*
        %s -> texto
        %d -> numero inteiro
        %.xf -> numeros reais ( casas decimais) 
        */
        System.out.println(String.format("Nome: %s e idade: %d", nome, idade));
        
        System.out.println(frase);
        
        String nomeCompleto = String.format("%s %s", nome, sobreNome);
        
        System.out.println(nomeCompleto);
         
        String frasePreco = String.format("O preço é R$%.2f", preco);
         
        System.out.println(frasePreco); 
         
    }
}
