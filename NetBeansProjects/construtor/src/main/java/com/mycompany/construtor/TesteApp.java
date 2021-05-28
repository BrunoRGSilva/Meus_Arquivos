/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.construtor;

/**
 *
 * @author DOM
 */
public class TesteApp {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Bruno", "ADS", 3);
        Aluno aluno2 = new Aluno("Bruna", "ADS", 3);

        System.out.println(String.format("Nome: %s \n "
                + "Faltas: %d \n Curso: %s \n "
                , aluno1.getNome(), aluno1.getFaltas(),
                aluno1.getCurso()));
        
         System.out.println(String.format("Nome: %s \n "
                + "Faltas: %d \n Curso: %s \n "
                , aluno2.getNome(), aluno2.getFaltas(),
                aluno2.getCurso()));
         System.out.println(aluno1);
    }

}
