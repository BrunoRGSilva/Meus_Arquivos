/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.de.renota;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOM
 */
public class Imobiliaria  {

    private String nome;
    private Integer caixa;
    private List<Imovel> imovelList;

    public Imobiliaria(String nome) {
        this.nome = nome;
        this.caixa = 0;
        this.imovelList = new ArrayList();
    }

    public void cadastrarImovel(Imovel imovel) {
        imovelList.add(imovel);
    }

    public void exibirImoveis() {
        for (Imovel imovel : imovelList) {
            System.out.println(imovel);
        }
    }

    public void exibirImoveisNovos() {
        if (!this.imovelList.isEmpty()) {
            for (Imovel imovelN : imovelList) {
                if (imovelN instanceof Imovel) {
                    System.out.println(imovelN);
                } else {
                    System.out.println("Não existe nenhum imóvel novo cadastrado");
                }
            }

        }
    }

    public void exibirImoveisUsado() {
        if (!this.imovelList.isEmpty()) {
            for (Imovel imovelU : imovelList) {
                if (imovelU instanceof Imovel) {
                    System.out.println(imovelU);
                } else {
                    System.out.println("Não existe nenhum imóvel Usado cadastrado");
                }

            }
        }
    }

    public void venderImovel(Integer idProcurado) {
        if (!this.imovelList.isEmpty()) {
            for (Imovel imovelV : imovelList) {
                if (idProcurado.equals(Imovel.class)) {
                    System.out.println(String.format("Imovel de id %d - Vendido", idProcurado));
                    imovelList.remove(imovelV);
                    caixa++;
                } else {
                    System.out.println(String.format("Imovel de id %d - não encontrado", idProcurado));
                }

            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCaixa() {
        return caixa;
    }

    @Override
    public String toString() {
        return "Imobiliaria: "
                + "\nNome: " + nome
                + "\nCaixa: " + caixa
                + "\nImoveis cadstrados:\n" + imovelList;

    }
}
