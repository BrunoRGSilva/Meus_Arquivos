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
public class Login {

    public static void main(String[] args) {

        Scanner senhaUsu = new Scanner(System.in);
        Scanner loginUsu = new Scanner(System.in);

        System.out.println("Informe seu login:");
        String login = loginUsu.nextLine();

        System.out.println("Informe seu senha:");
        String senha = senhaUsu.nextLine();

        System.out.println("Digite o numero de tentativas:");
        String senhasErradas = senhaUsu.nextLine();

        System.out.println(String.format("Seu login é %s e sua senha é %s "
                + ". BVocê tem %s tentativas até ser bloqueado", login, senha, senhasErradas));

    }
}
