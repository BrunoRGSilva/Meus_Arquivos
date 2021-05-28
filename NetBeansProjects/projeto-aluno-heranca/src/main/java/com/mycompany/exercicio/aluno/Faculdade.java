/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOM
 */
public class Faculdade {

    private String nome;
    private Integer vagas;
    private List<Aluno> alunos;

    public void matricularAluno(Aluno aluno) {
        if (alunos.size() < this.vagas) {
            alunos.add(aluno);
        } else {
            System.out.println("Não possui mais vagasS");
        }

    }

    public void exibirAlunosMatriculados() {
        if (alunos.isEmpty()) {
            System.out.println(String.format("A faculdade %s não possui alunos matriculados", this.nome));
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }

        }
    }

    public void exibirAlunosPos() {
        Boolean possuiAlunoPos = false;
        
        if (alunos.isEmpty()) {
            System.out.println(String.format("A faculdade %s não possui alunos matriculados", this.nome));
        } else {
            for (Aluno itensDaLista : alunos) {
                if (itensDaLista instanceof AlunoPos) {
                    System.out.println(itensDaLista);
                    possuiAlunoPos = true;
                }

            }

        }
        if(!possuiAlunoPos){
            System.out.println("A faculdade não possui aluno de pós");
        }
    }

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.alunos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return String.format("\nFaculdade : %s \n"
                + "Vagas : %d\n"
                + "Alunos : %s\n", 
                this.nome, 
                this.vagas, 
                this.alunos);
    }

}
