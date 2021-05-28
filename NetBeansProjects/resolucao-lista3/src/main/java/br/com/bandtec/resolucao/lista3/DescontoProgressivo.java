/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.resolucao.lista3;

import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class DescontoProgressivo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de Desconto progressivo"
                + "\nDigite o valor unitario do produto:");
        Double valorUni = leitor.nextDouble();
        System.out.println("Digite a quantidade:");
        Integer unidades = leitor.nextInt();

    }
    static Double calcularDesconto (Double valorUni, Integer unidades){
    Double total =  unidades * valorUni;
    
    return total;
    }
    static void exibirNotaFiscal(Double total, Integer unidades){
        if (unidades == 1) {
            Double desconto = total - (total /100)*10;
        } else if (unidades == 2) {
            Double desconto = total - (total /100)*20;
        }else if (unidades >= 3) {
            Double desconto = total - (total /100)*30;
        }

    }
    
    
    
}
