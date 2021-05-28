/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista_01;

import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class CalculoDeTroco {
    public static void main(String[] args) {
        
           Scanner usuarioNum = new Scanner(System.in);
        
        System.out.println("Valor Unitario:");
        Double numUnitario = usuarioNum.nextDouble();
        
        System.out.println("Quantos foram vendidos:");
        Double numVenda = usuarioNum.nextDouble();
        
        System.out.println("Valor Pago:");
        Double numPago = usuarioNum.nextDouble();
        
        Double caucTroco = (numUnitario * numVenda) - numPago;
        
        System.out.println("Troco:" + caucTroco);
         
        
        
        
    }
}
