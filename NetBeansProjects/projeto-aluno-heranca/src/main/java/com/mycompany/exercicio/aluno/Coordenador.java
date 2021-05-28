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
public class Coordenador extends Professor {

    private Integer qtdHoraCoord;
    private Double valorHoraCoord;
    private String curso;

    @Override
    public Double calculaSalario() {
        Double salarioCoord = super.qtdHoras * super.valorHora
                * 4.5 + this.qtdHoraCoord * this.valorHoraCoord * 4.5;
        return salarioCoord; //To change body of generated methods, choose Tools | Templates.
    }

    public Coordenador(Integer codigo, String nome, Integer qtdHoras, Double valorHora) {
        super(codigo, nome, qtdHoras, valorHora);
    }

    @Override
    public String toString() {
        return "Coordenador{" + "qtdHoraCoord=" + qtdHoraCoord + ", valorHoraCoord=" + valorHoraCoord + ", curso=" + curso + '}';
    }

}
