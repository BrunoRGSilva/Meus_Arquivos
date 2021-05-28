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
public class Aluno {
    
    private Integer ra;
    private String nome;
    private String curso;
    private Integer faltas;
    private Double notaFinal;

    public Aluno(String nome, String curso, Integer faltas) {
        this.nome = nome;
        this.curso = curso;
        this.faltas = faltas;
    }
    
     
    
    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }
////////////////////////////////////////////
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
        
      
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", curso=" + curso + ", faltas=" + faltas + ", notaFinal=" + notaFinal + '}';
    }
  
}
