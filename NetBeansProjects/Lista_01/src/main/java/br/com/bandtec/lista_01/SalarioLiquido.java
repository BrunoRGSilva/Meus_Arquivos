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
public class SalarioLiquido {
    public static void main(String[] args) {
        
        
        Scanner salario = new Scanner(System.in);
        Scanner conducao = new Scanner(System.in);
        
        System.out.println("Valor do salario bruto:");
        Double salarioBruto = salario.nextDouble();
       
        Double inssDesconto = salarioBruto * 10/100;
       
        Double irDesconto = salarioBruto * 20/100;
        
        System.out.println("Valor da condução de ida para o trabalho:");
        Double valorConducao = salario.nextDouble();
        
        Double totalConducao = valorConducao*2*22;
        
        Double descontosTotais = inssDesconto + irDesconto + totalConducao;
        
        Double salarioTotal = salarioBruto - descontosTotais;
        
        System.out.println(String.format("Seu Bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um liquido de R$%.2f.", salarioBruto, descontosTotais, salarioTotal));
        
        
        
    }
}
