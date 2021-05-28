/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encomendas;

/**
 *
 * @author DOM
 */
public class Produtos {

    Double altura = 0.0;
    Double largura = 0.0;
    String endereçoRemetente;
    String endereçoDestinatario;
    Double distancia = 0.0;
    Double valorEncomenda = 0.0;

    Double calculaFrete(Double frete) {

        if (altura <= 6.9 && largura <= 16.0
                && distancia <= 50.0 && valorEncomenda <= 3.0) {
            frete = valorEncomenda - (valorEncomenda * (1 / 100));

        } else if (altura >= 7.0 || altura <= 15.9 && largura >= 16.1
                || largura <= 50.0 && distancia > 51.0
                || distancia <= 200.0 && valorEncomenda.equals(5.0)) {
            frete = valorEncomenda - (valorEncomenda * (3 / 100));

        } else if (altura > 16.0 && largura >= 51.0 && distancia > 200.0 && valorEncomenda.equals(7.0)) {
            frete = valorEncomenda - (valorEncomenda * (5 / 100));
        }
        return frete;
    }

    Double emitirEtiqueta(Double frete) {
        Double total = frete + valorEncomenda;
        System.out.println(String.format(
                "Endereço do remetente: %s"
                + "Endereço do destinátario: %s"
                + "Altura da encomenda: %.2f"
                + "Largura da encomenda: %.2f"
                + "---------------------------------"
                + "Valor da encomenda: %.2f"
                + "Valor do frete: %.2f"
                + "----------------------------------"
                + "Valor Total: %.2f", endereçoRemetente, endereçoDestinatario,
                altura, largura, valorEncomenda, frete, total));
        return total;
    }

}
