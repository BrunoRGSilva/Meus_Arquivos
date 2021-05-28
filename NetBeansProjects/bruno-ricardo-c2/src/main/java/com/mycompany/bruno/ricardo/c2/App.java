/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bruno.ricardo.c2;

/**
 *
 * @author DOM
 */
public class App {

    public static void main(String[] args) {

        Paciente novoP = new Paciente("bruno", "gripe", "não", "não");
        Paciente novoP2 = new Paciente("bruna", "cancer", "internado", "não");
        Paciente novoP3 = new Paciente("bruno", "perna quebrada", "internado", "operado");

        
        Hospital novoH = new Hospital(Integer.MIN_VALUE, 
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        
        
        novoH.registraInternacao(novoP);
        novoH.registraCirurgia(novoP);
        novoH.registraAlta(novoP);
        
        
    }
}
