/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.validarcpf;

import javax.swing.JOptionPane;

/**
 *
 * @author DOM
 */
public class Validacao {

    public static void main(String[] args) {

        do {
            String cpf = "";
            boolean verificador = false;

            String st = "Informe seu CPF";
            cpf = JOptionPane.showInputDialog(st);

            if (cpf == null) {
                System.exit(0);
            }

            if (cpf.equals("")) {
                st = "Digite o número do cpf!";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }

            if (cpf.length() != 11) {
                st = "O cpf deve ter 11 caracteres!";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }

            if (cpf.charAt(0) == '0' || cpf.charAt(0) == '1' || cpf.charAt(0) == '2' || cpf.charAt(0) == '3' || cpf.charAt(0) == '4'
                    || cpf.charAt(0) == '5' || cpf.charAt(0) == '6' || cpf.charAt(0) == '7' || cpf.charAt(0) == '8' || cpf.charAt(0) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(1) == '0' || cpf.charAt(1) == '1' || cpf.charAt(1) == '2' || cpf.charAt(1) == '3' || cpf.charAt(1) == '4'
                    || cpf.charAt(1) == '5' || cpf.charAt(1) == '6' || cpf.charAt(1) == '7' || cpf.charAt(1) == '8' || cpf.charAt(1) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(2) == '0' || cpf.charAt(2) == '1' || cpf.charAt(2) == '2' || cpf.charAt(2) == '3' || cpf.charAt(2) == '4'
                    || cpf.charAt(2) == '5' || cpf.charAt(2) == '6' || cpf.charAt(2) == '7' || cpf.charAt(2) == '8' || cpf.charAt(2) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(3) == '0' || cpf.charAt(3) == '1' || cpf.charAt(3) == '2' || cpf.charAt(3) == '3' || cpf.charAt(3) == '4'
                    || cpf.charAt(3) == '5' || cpf.charAt(3) == '6' || cpf.charAt(3) == '7' || cpf.charAt(3) == '8' || cpf.charAt(3) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(4) == '0' || cpf.charAt(4) == '1' || cpf.charAt(4) == '2' || cpf.charAt(4) == '3' || cpf.charAt(4) == '4'
                    || cpf.charAt(4) == '5' || cpf.charAt(4) == '6' || cpf.charAt(4) == '7' || cpf.charAt(4) == '8' || cpf.charAt(4) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(5) == '0' || cpf.charAt(5) == '1' || cpf.charAt(5) == '2' || cpf.charAt(5) == '3' || cpf.charAt(5) == '4'
                    || cpf.charAt(5) == '5' || cpf.charAt(5) == '6' || cpf.charAt(5) == '7' || cpf.charAt(5) == '8' || cpf.charAt(5) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(6) == '0' || cpf.charAt(6) == '1' || cpf.charAt(6) == '2' || cpf.charAt(6) == '3' || cpf.charAt(6) == '4'
                    || cpf.charAt(6) == '5' || cpf.charAt(6) == '6' || cpf.charAt(6) == '7' || cpf.charAt(6) == '8' || cpf.charAt(6) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(7) == '0' || cpf.charAt(7) == '1' || cpf.charAt(7) == '2' || cpf.charAt(7) == '3' || cpf.charAt(7) == '4'
                    || cpf.charAt(7) == '5' || cpf.charAt(7) == '6' || cpf.charAt(7) == '7' || cpf.charAt(7) == '8' || cpf.charAt(7) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(8) == '0' || cpf.charAt(8) == '1' || cpf.charAt(8) == '2' || cpf.charAt(8) == '3' || cpf.charAt(8) == '4'
                    || cpf.charAt(8) == '5' || cpf.charAt(8) == '6' || cpf.charAt(8) == '7' || cpf.charAt(8) == '8' || cpf.charAt(8) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(9) == '0' || cpf.charAt(9) == '1' || cpf.charAt(9) == '2' || cpf.charAt(9) == '3' || cpf.charAt(9) == '4'
                    || cpf.charAt(9) == '5' || cpf.charAt(9) == '6' || cpf.charAt(9) == '7' || cpf.charAt(9) == '8' || cpf.charAt(9) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }
            if (cpf.charAt(10) == '0' || cpf.charAt(10) == '1' || cpf.charAt(10) == '2' || cpf.charAt(10) == '3' || cpf.charAt(10) == '4'
                    || cpf.charAt(10) == '5' || cpf.charAt(10) == '6' || cpf.charAt(10) == '7' || cpf.charAt(10) == '8' || cpf.charAt(10) == '9') {

            } else {
                st = "CPF deve conter apenas números";
                JOptionPane.showMessageDialog(null, st, "Erro", 0);
                continue;
            }

            st = "CPF válido: " + cpf;
            JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
            verificador = true;
            System.exit(0);

        } while (true);
    }

}

