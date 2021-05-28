/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.heranca;

/**
 *
 * @author DOM
 */
public class AlunoGraduacao extends Aluno {

    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoGraduacao(Integer ra, String nome) {
        super(ra, nome);
        this.notaContinuada = 0.0;
        this.notaIntegrada = 0.0;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public String toString() {

        return String.format("RA: %d\nNome: %s\nNota C: %2.f\nNota I: %2.f",
                this.getRa(),
                this.getNome(),
                this.getNotaContinuada(),
                this.getNotaIntegrada()
        );
    }

}
