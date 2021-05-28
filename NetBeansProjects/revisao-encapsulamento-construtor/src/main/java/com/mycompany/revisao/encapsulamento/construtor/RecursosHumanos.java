/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.revisao.encapsulamento.construtor;

/**
 *
 * @author DOM
 */
public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalReajustes;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalReajustes = 0;
    }

    public void reajustarSalario(Colaborador colab, Double valorReajuste) {
        /* Crie uma variavel para facilitar 
        a visualização exemplo abaixo da variavel salarioAtual*/
        Double salarioAtual = colab.getSalario();
        Double valorASerReajustado = colab.getSalario() * (valorReajuste / 100);
        colab.setSalario(colab.getSalario() + valorASerReajustado);
    }

    public void promoverColaborador(Colaborador colab, String novoCargo, Double novoSalario) {

        if (colab.getSalario() < novoSalario) {
            colab.setSalario(novoSalario);
            colab.setCargo(novoCargo);
            totalReajustes++;
        } else {
            System.out.println("Para promover, ofereça um "
                    + "salario maior que o atual ó_ó ");
        }

    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustes() {
        return totalReajustes;
    }

    @Override
    public String toString() {
        return String.format("Total promovidos: %d \n Total Reajustados: %d"
                ,this.totalPromovidos, this.totalReajustes);
    }

}
