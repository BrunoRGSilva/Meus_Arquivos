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
public class BolsaFilhos {
    public static void main(String[] args) {
        
        
        Scanner quantosFilhos = new Scanner(System.in);
        Scanner valorBolsa = new Scanner(System.in);
  
        System.out.println("Quantos filhos de o a 3 anos:");
        Integer filhosBebe = quantosFilhos.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16:");
        Integer filhosCrianca = quantosFilhos.nextInt();
  
        System.out.println("Quantos filhos de 17 a 18:"); 
        Integer filhosAdole = quantosFilhos.nextInt();

        Double bebe = (filhosBebe * 25.12);
        
        Double crianca = (filhosBebe * 15.88);
        
        Double adole = (filhosBebe * 12.44);
        
        Integer totalFilhos = filhosAdole + filhosBebe + filhosCrianca;
        
        Double valorTotal = bebe + crianca + adole;
        
        System.out.println(String.format("Você tem um total de %d e vai "
                + "receber R$%.2f de bolsa", totalFilhos, valorTotal));
        
        
    }
}
