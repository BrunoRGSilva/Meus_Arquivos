/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.agregacao;

/**
 *
 * @author DOM
 */
public class App {

    public static void main(String[] args) {

        Contato c1 = new Contato("Bruna", "1195469522");
        Contato c2 = new Contato("Sayuri", "11978469522");

        
        Grupo professoresBandtec = new Grupo ("professores Bandtec");
        
        
        professoresBandtec.adiciona(c1);
        professoresBandtec.adiciona(c2);
        
        System.out.println(professoresBandtec);
        
        professoresBandtec.remove(c2);
        
        System.out.println(professoresBandtec);
    }
}
