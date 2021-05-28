/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.revisao.encapsulamento.construtor;

/**
 *
 * @author DOM
 */
public class TesteColaborador {

    public static void main(String[] args) {

        Colaborador colab1 = new Colaborador("Bruno", "Dev Java Pleno", 7.000);
        Colaborador colab2 = new Colaborador("Bruna", "Dev Java Pleno", 7.000);

        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(colab1);
        System.out.println(colab2);

        rh.promoverColaborador(colab1, "Dev Java Senior", 10000.00);
        rh.promoverColaborador(colab2, "Dev Java Pleno", 8000.00);

        rh.reajustarSalario(colab2, 10.5);

        System.out.println(colab1);
        System.out.println(colab2);
        
        System.out.println(rh);
        
    }

}
