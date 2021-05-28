/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.de.renota;

/**
 *
 * @author DOM
 */
public class ImovelNovo extends Imovel {

    public ImovelNovo(Integer id, String titulo, String localizacao, Integer comodos, Double precoPorMetroQuadrado) {
        super(id, titulo, localizacao, comodos, precoPorMetroQuadrado);
    }

    @Override
    public Double getPrecoImovel() {
        Double desconto = super.getPrecoImovel() + (super.getPrecoImovel() * 0.2);
        return desconto;

    }

    @Override
    public String toString() {
        return "\nImovel Novo:"
                + super.toString();

    }
}
