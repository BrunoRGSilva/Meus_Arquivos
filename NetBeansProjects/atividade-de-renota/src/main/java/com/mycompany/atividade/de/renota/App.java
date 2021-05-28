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
public class App {

    public static void main(String[] args) {
        Imovel imvL = new Imovel(1, "Jaguariu", "Jaguar do Sul", 7, 250.00);
        ImovelNovo imvN2 = new ImovelNovo(2, "Sabaody", "Grand Line", 13, 950.00);
        ImovelUsado imvU3 = new ImovelUsado(3, "Enies Lobby", "Portão do Julgamento", 15, 1250.00);

        Imobiliaria imb = new Imobiliaria("Nova Lima");

        imb.cadastrarImovel(imvL);
        imb.cadastrarImovel(imvN2);
        imb.cadastrarImovel(imvU3);

        imb.exibirImoveisNovos();
        imb.exibirImoveisUsado();

        imb.venderImovel(2);
        imb.venderImovel(9);

        imb.exibirImoveis();
        System.out.println(imb);
    }

}
