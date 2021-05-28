/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.heranca;

/**
 *
 * @author DOM
 */
public class App {
    public static void main(String[] args) {
        Aluno alu1 = new Aluno(1234, "Doido");
        
        AlunoGraduacao al2 = new AlunoGraduacao(99, "Aluno de Graduação");
        
        al2.getNome();
        al2.getNotaContinuada();
        al2.getNotaIntegrada();
        al2.getRa();
                
    }
    
}
