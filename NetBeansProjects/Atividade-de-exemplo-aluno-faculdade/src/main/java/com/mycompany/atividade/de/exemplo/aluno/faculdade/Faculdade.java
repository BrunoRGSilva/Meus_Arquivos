/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.de.exemplo.aluno.faculdade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOM
 */
public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    public void matricularAluno(Aluno aluno) {
        aluno.setAtivo(true);
        alunos.add(aluno);
    }

    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoDaVez = alunos.get(i);
            if (alunoDaVez.getRa().equals(ra)) {
                alunoDaVez.setAtivo(false);
            }

        }
        //for(Aluno alunoDaVez : alunos){
        //if (alunoDaVez.getRa().equals(ra)) {
        //     alunoDaVez.isAtivo(false);  
        //  }
        //  }/
    }

    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

    }

    public void exibirAlunosPorSemestre(Integer semestre) {

        for (Aluno aluno : alunos) {
            if (aluno.getSemestre().equals(semestre)) {
                System.out.println(aluno);
            }
        }

    }

    public void exibirCancelados() {
        for (Aluno alunoDaVez : alunos) {
            if (alunoDaVez.getAtivo().equals(false)) {
                System.out.println(alunoDaVez);
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}
