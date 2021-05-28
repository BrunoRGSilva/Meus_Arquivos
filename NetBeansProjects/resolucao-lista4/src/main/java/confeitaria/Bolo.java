/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria;

/**
 *
 * @author DOM
 */
public class Bolo {

    String sabor;
    Double valor = 0.0;
    Integer quantidadeVendida = 0;

    void  comprarBolo(Integer quantidadeDesejada ) {
        
        if ((quantidadeVendida + quantidadeDesejada) >= 100) {
            System.out.println("Seu pedido ultrapassou "
                    + "nosso limite diário para esse bolo\n");
        } else {
            quantidadeVendida += quantidadeDesejada;
            System.out.println("Bolo de " + sabor + "comprado");
        }

    }

    Double exibirRelatorio() {
        Double valorTotal = valor * quantidadeVendida;
        System.out.println(String.format("O bolo sabor %s, "
                + "foi comprado %d vezes hoje,"
                + "totalizando R$%.2f", sabor, quantidadeVendida, valorTotal));
        return valorTotal;
    }
}
