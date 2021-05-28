/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.de.exemplo.aluno.faculdade;

/**
 *
 * @author DOM
 */
public class App {

    public static void main(String[] args) {

        Aluno al1 = new Aluno("2001", "Bruno", 3);
        Aluno al2 = new Aluno("2002", "Bruna", 1);
        Aluno al3 = new Aluno("2003", "Bia", 2);
        Aluno al4 = new Aluno("2004", "Bianca", 1);
        Aluno al5 = new Aluno("2005", "Rafa", 3);

        System.out.println(al1);

        Faculdade faculdade = new Faculdade("Bandtec - melhor faculdade de tecnologia");

        faculdade.matricularAluno(al1);
        faculdade.matricularAluno(al2);
        faculdade.matricularAluno(al3);
        faculdade.matricularAluno(al4);
        faculdade.matricularAluno(al5);
        
        faculdade.exibirAlunos();
        
        faculdade.exibirAlunosPorSemestre(3);
        faculdade.exibirAlunosPorSemestre(1);
        faculdade.exibirAlunosPorSemestre(2);
        
        faculdade.cancelarMatricula("2001");
        faculdade.cancelarMatricula("2002");
        faculdade.cancelarMatricula("2003");
        faculdade.cancelarMatricula("2004");
        faculdade.cancelarMatricula("2005");
        
        
        faculdade.exibirCancelados();

    }
}
