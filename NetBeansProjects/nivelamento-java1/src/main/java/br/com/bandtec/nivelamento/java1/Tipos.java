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
public class Tipos {
    public static void main(String[] args) {
        // Java possui tipagem estática
        //Javascript tipagem dinâmica
        String nome = "Bruno Ricardo";
        String cidade = "São Paulo";
        String faculdade = "Bandtec";
        
        // variaveis do tipo inteiro -> Integer
        Integer idade = 22;
        Integer anoNascimento = 1998;
        Integer quantidadeDeAlgo = 5;
        
        // Variaveis do tipo numerico real (com casas decimais) -> Double
        Double preco = 17.50;
        Double temperatura = 33.7;
        Double poderMagico = 1250.65;
        
        // Variaveis logicas ou "Booleanas" -> Boolean
        Boolean ligado = true;
        Boolean sabeJava = false;
        Boolean temMundial = false;
        
        System.out.println("Meu nome é: " + nome + " e estudo na melhor faculdade a " 
                + faculdade + " na cidade de " + cidade);
        
        System.out.println(idade);
        System.out.println(ligado);
        System.out.println(preco);
        
        
        
    }
}
