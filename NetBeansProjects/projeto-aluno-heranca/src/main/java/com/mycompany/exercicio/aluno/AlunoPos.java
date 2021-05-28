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
public class AlunoPos extends Aluno {

    private Double notaMonografia;

    @Override
    public Double calculaMedia() {
        return (super.notaContinuada + super.notaSemestral + this.notaMonografia) / 3;
    }

    public AlunoPos(Double notaMonografia, Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;

    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

    @Override
    public String toString() {
        return String.format("\nRA : %d\n"
                + "Aluno: %s \n"
                + "Nota Continuada: %.2f \n"
                + "Nota semestral: %.2f \n"
                + "Nota monografia: %.2f \n"
                + "Nota media: %.2f\n",
                super.getRa(),
                super.getNome(),
                super.getNotaContinuada(),
                super.getNotaSemestral(),
                this.notaMonografia,
                this.calculaMedia());
    }

}
