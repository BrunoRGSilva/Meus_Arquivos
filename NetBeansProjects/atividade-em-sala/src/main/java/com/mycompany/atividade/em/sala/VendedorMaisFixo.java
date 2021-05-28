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
public class VendedorMaisFixo extends VendedorComissao {

    private Double salarioFixo;

    public VendedorMaisFixo(Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    
    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = getTaxa() * getVendas();
    }

    public VendedorMaisFixo(Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
    }

    @Override
    public Double calcularSalario() {
        return this.salarioFixo ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return String.format("Vendedor Comissão mais fixo: \n",
                 "Codigo: %d \n"
                + "Nome: %s \n"
                + "Vendas: %.2f\n"
                + "Taxa: %.1f%%\n"
                + "Salario: %.2f"
                + "Salario Final: %.2f",
                super.getCodigo(),
                super.getNome(),
                super.getVendas(),
                super.getTaxa(),
                this.salarioFixo,
            this.calcularSalario());
    }

 
    
}
