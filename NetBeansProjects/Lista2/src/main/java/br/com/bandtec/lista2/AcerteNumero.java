/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista2;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author DOM
 */
public class AcerteNumero {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Integer contador = 0;
        System.out.println("O sorteio vai começar:");
        System.out.println("Digite um numero entre 0 e 10:");
        Integer numDigitado = num.nextInt();

        while (true) {

            Integer numRandon = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(numRandon);
            if (numRandon.equals(numDigitado) && contador > 0 && contador <= 3) {

                System.out.println(String.format("Numero sorteado %d", numRandon));
                System.out.println("Você é MUITO Sortudo!");
                break;
            } else if (numRandon.equals(numDigitado) && contador > 4 && contador <= 10) {

                System.out.println(String.format("Numero sorteado %d", numRandon));
                System.out.println("Você é sortudo");
                break;
            } else if (numRandon.equals(numDigitado) && contador > 10) {

                System.out.println(String.format("Numero sorteado %d", numRandon));
                System.out.println("É melhor você parar de apostar e ir trabalhar!");
                break;
            } else if (numDigitado > 10) {
                System.out.println("Numero Invalido");
            }

            contador++;

        }

    }

}
