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
public class Professor {
    protected Integer codigo;
    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;

    public Double calculaSalario(){
    
   Double salarioProf = qtdHoras * valorHora * 4.5;
    return salarioProf;
    }
    
    
    
    
    public Professor(Integer codigo, String nome, Integer qtdHoras, Double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Professor{" + "codigo=" + codigo + ", nome=" + nome + ", qtdHoras=" + qtdHoras + ", valorHora=" + valorHora + '}';
    }
   
    
}
