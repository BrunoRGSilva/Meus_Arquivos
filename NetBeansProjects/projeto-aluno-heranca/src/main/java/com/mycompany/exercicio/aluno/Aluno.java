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
public class Aluno {

    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(Double notaSemestral) {
        this.notaSemestral = notaSemestral;
    }

    public Double calculaMedia() {

        Double notaMed = notaContinuada * 0.4 + notaSemestral * 0.6;

        return notaMed;
    }

    @Override
    public String toString() {
        return String.format("\nRA : %d\n"
                + "Aluno : %s\n"
                + "Nota continuada : %.2f\n"
                + "Nota semestral: %.2f\n"
                + "Média: %.2f",
                this.ra,
                this.nome, 
                this.notaContinuada, 
                this.notaSemestral,
                this.calculaMedia());

    }

}
