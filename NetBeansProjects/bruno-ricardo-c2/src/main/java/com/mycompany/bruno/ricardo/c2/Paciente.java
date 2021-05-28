/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bruno.ricardo.c2;

/**
 *
 * @author DOM
 */
public class Paciente {
    
    private String nome;
    private Integer idPaciente = 0;
    private String doenca;
    private String estaInternado;
    private Double valorCirurgia = 0.0;
    private Double valorDiaria = 0.0;
    private Integer qtdDias = 0;
    private String foiOperado;

    public Paciente(String nome, String doenca, String estaInternado, String foiOperado) {
        this.nome = nome;
        this.doenca = doenca;
        this.estaInternado = estaInternado;
        this.foiOperado = foiOperado;
    }
    

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getEstaInternado() {
        return estaInternado;
    }

    public void setEstaInternado(String estaInternado) {
        this.estaInternado = estaInternado;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Integer getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(Integer qtdDias) {
        this.qtdDias = qtdDias;
    }

    public String getFoiOperado() {
        return foiOperado;
    }

    public void setFoiOperado(String foiOperado) {
        this.foiOperado = foiOperado;
    }

   

   
    
   

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();

        str.append("\nSTATUS PACIENTE:\n");
        str.append("  ID: %d\n");
        str.append("  NOME: %s\n");
        str.append("  DOENÇA: %s\n");
        str.append("  STATUS: %s\n");
        str.append("  VALOR DA DIARIA: R$%.2f\n");
        str.append("  VALOR DA CIRURGIA: R$%.2f\n");

        return String.format(
                str.toString(),
                this.idPaciente,
                this.nome,
                this.doenca,
                this.estaInternado,
                this.valorCirurgia,
                this.valorDiaria,
                this.foiOperado);
    }

}
