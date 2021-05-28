/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOM
 */
public class App2 {

    public static void main(String[] args) {

        List<String> bandas = new ArrayList<>();

        bandas.add("Ikimono gakari");
        bandas.add("Yui");
        bandas.add("Mika Nakashima");

        /* for (int i = 0; i < bandas.size(); i++) {
          
            System.out.println("Bandas" + bandas.get(i));
        }
        // enhanced for
        for (String banda : bandas) {
            System.out.println(banda); 
        }
         */
        List<Aluno> alunos = new ArrayList<>();

        Aluno a1 = new Aluno(1, "Bruno");
        Aluno a2 = new Aluno(1, "Bruna");
        Aluno a3 = new Aluno(1, "Brunilde");

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
        
        
    }

}
