/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo2;

import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author DOM
 */
public class App {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();

        conta1.depositar50();
        conta1.depositar50();
        conta1.depositar50();
        conta1.depositar50();
        conta1.depositar50();

        conta1.sacar50();
        conta1.sacar50();
        conta1.sacar50();
        conta1.sacar50();
        conta1.sacar50();

        conta1.getSaldo();
        conta1.verificaSituacaoFinanceira();
        
    }
}
