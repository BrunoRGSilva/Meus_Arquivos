/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author DOM
 */
public class Sorteio {

    public static void main(String[] args) {

        Scanner numDigitado = new Scanner(System.in);
        System.out.println("Digite um numero:");
        Integer sorteado = numDigitado.nextInt();
        Integer pares = 0;
        Integer impares = 0;

        Integer aleatorio = ThreadLocalRandom.current().nextInt(1, 100);

        for (int i = 1; i <= 200; i++) {
            aleatorio = ThreadLocalRandom.current().nextInt(1, 100);

            if (aleatorio.equals(sorteado)) {
                System.out.println(String.format("\nO Numero Sorteado foi: %d"
                        + "\nTotal de numeros Pares: %d"
                        + "\nTotal de numeros Impares: %d",
                        aleatorio, pares, impares));
                break;
            } else if (aleatorio % 2 == 1) {
                impares++;
                System.out.println(String.format("\nNumeros Impares: %d",
                        impares));
            } else if (aleatorio % 2 == 0) {
                pares++;
                System.out.println(String.format("\nNumeros pares: %d",
                        pares));
            }

        }
    }
}
