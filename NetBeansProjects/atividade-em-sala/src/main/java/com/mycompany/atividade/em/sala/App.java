/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.em.sala;

/**
 *
 * @author DOM
 */
public class App {
    public static void main(String[] args) {
        
        VendedorComissao vendor1 = new VendedorComissao(5, "Jão", 8.5, 9.5);

        VendedorMaisFixo vendor2 = new VendedorMaisFixo(5, "juuju", 45.5, 5222.0);

        System.err.println(vendor1);
        System.out.println(vendor2);
    }
  
   
}
