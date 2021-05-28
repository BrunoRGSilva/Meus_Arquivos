/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo2;

/**
 *
 * @author DOM
 */
public class ContaCorrente {

    //por padrão os atributos nascem privados e podem ser modificados ao longo do tempo
    private String situacao = "Conta no vermelho";
    private Double saldo = 0.0;

    void depositar50() {
        Double novosaldo = saldo + 50;
        if ((saldo + 50) <= 200) {
            saldo += 50;
            System.out.println("deposito feito com sucesso");
        } else {
            System.out.println(String.format("conta atingiu o limite: %.2f", saldo));
        }
    }

    void sacar50() {
        if ((saldo - 50) >= 0) {
            saldo -= 50;
            System.out.println("saque feito com sucesso");
        } else {
            System.out.println(String.format("saldo insuficiente na conta: %.2f", saldo));
        }

    }

    //para recuperar informações ( atributos de uma classe) privadas
    //utilizamos o padão "get"
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void verificaSituacaoFinanceira() {
        if (saldo > 100) {
            situacao = "Razoavel";
        } else {
            situacao = "Tá gastando muito";
        }
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
