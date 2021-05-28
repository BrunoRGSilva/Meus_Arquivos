/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.nivelament.java2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author DOM
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        
        
        Integer numeroGerado = ThreadLocalRandom.current().nextInt(0, 100);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(numeroGerado);
            numeroGerado = ThreadLocalRandom.current().nextInt(0, 100);
        }
        
        
    }
}
