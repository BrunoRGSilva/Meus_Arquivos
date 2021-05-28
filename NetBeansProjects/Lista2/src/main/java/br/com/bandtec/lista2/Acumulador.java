/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author DOM
 */
public class Acumulador {

    public static void main(String[] args) {

        Integer aleatorio = ThreadLocalRandom.current().nextInt(0, 100);
        while (true) {
            aleatorio = ThreadLocalRandom.current().nextInt(0, 100);
            System.out.println(aleatorio);

            if (aleatorio.equals(0)) {
                System.out.println();
                break;
            }

        }

    }

}
