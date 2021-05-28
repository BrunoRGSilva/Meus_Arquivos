/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.em.sala;

/**
 *
 * @author DOM
 */
public class VendedorComissao {

    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
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

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return String.format("Vendedor Comissão: \n"
                + "Codigo: %d \n"
                + "Nome: %s \n"
                + "Vendas: %.2f\n"
                + "Taxa: %.1f%%",
                this.codigo,
                this.nome,
                this.vendas,
                this.taxa);

    }

    public Double calcularSalario() {

        return this.vendas * this.taxa / 100;

    }

}
