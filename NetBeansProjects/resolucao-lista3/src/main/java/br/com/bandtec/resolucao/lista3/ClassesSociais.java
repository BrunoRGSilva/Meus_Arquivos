/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.resolucao.lista3;

import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class ClassesSociais {

    public static void main(String[] args) {
        Scanner rendaSala = new Scanner(System.in);
        Double salaMini = 1100.00;
        System.out.println("Informe sua renda");
        Double rendaPessoa = rendaSala.nextDouble();
        Double renda = (rendaPessoa / salaMini);

        System.out.println(String.format("Você recebe aproximadamente"
                + " %.1f de salarios minimos", renda));
        rendaTotal(rendaPessoa, salaMini);
    }

    static void rendaTotal(Double rendaPessoa, Double salaMini) {

        if (rendaPessoa <= salaMini * 2) {
            System.out.println("Você pertence a classe social: E");
        } else if (rendaPessoa > salaMini * 2 && rendaPessoa <= salaMini * 4) {
            System.out.println("Você pertence a classe social: D");
        } else if (rendaPessoa > salaMini * 4 && rendaPessoa <= salaMini * 10) {
            System.out.println("Você pertence a classe social: C");
        } else if (rendaPessoa > salaMini * 10 && rendaPessoa <= salaMini * 20) {
            System.out.println("Você pertence a classe social: B");
        } else if (rendaPessoa > salaMini * 20) {
            System.out.println("Você pertence a classe social: A");
        } else {
        }

    }
}
