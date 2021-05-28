/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista2;

import java.util.Scanner;

/**
 *
 * @author DOM
 */
public class Tabuada {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Digite um numero:");
        Integer multNum = num.nextInt();

        System.out.println(String.format("Tabuada do %d", multNum));
        for (int i = 0; i <= 10; i++) {
            Integer resultado = multNum * i;
            System.out.println(String.format("%d X %d = %d", multNum, i, resultado));

        }

    }
}
