/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.aluno;

/**
 *
 * @author DOM
 */
public class ProgramaAlunoHeranca {

    public static void main(String[] args) {

        Aluno al1 = new Aluno(12, "Bruno", 7.0, 6.8);
        Aluno al2 = new Aluno(13, "Bruna", 5.0, 9.8);
        Aluno al3 = new Aluno(14, "Bianca", 7.5, 4.8);

        System.out.println(String.format("\nO Aluno %s tem média %.2f", al1.getNome(), al1.calculaMedia()));
        System.out.println(al1);

        System.out.println(String.format("\nO Aluno %s tem média %.2f", al2.getNome(), al2.calculaMedia()));
        System.out.println(al2);

        System.out.println(String.format("\nO Aluno %s tem média %.2f", al3.getNome(), al3.calculaMedia()));
        System.out.println(al3);

        AlunoPos al1p = new AlunoPos(8.0, 5, "Paula", 8.5, 7.5);

        System.out.println(String.format("\nO aluno %s de pós tem média %.2f", al1p.getNome(), al1p.calculaMedia()));
        System.out.println(al1p);

        AlunoPos al2p = new AlunoPos(8.0, 5, "Julia", 9.5, 5.5);

        System.out.println(String.format("\nO aluno %s de pós tem média %.2f", al2p.getNome(), al2p.calculaMedia()));
        System.out.println(al2p);

        AlunoPos al3p = new AlunoPos(6.0, 5, "Betanie", 5.5, 3.5);

        System.out.println(String.format("\nO aluno %s de pós tem média %.2f", al3p.getNome(), al3p.calculaMedia()));
        System.out.println(al3p);

        Faculdade fac1 = new Faculdade("USP", 500);

        fac1.matricularAluno(al1);
        fac1.matricularAluno(al2);
        fac1.matricularAluno(al3);

        fac1.matricularAluno(al1p);
        fac1.matricularAluno(al2p);
        fac1.matricularAluno(al3p);

        fac1.exibirAlunosMatriculados();
        fac1.exibirAlunosPos();
        System.out.println(fac1);
        

    }
}
