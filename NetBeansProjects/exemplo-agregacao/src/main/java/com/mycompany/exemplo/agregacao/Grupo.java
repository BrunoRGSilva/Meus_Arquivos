/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOM
 */
public class Grupo {

    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }


    public void adiciona(Contato contato) {
        contatos.add(contato);

    }

    public void remove(Contato contato) {
        contatos.remove(contato);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }


    @Override
    public String toString() {
        return "Grupo{" + "nome=" + nome + ", contatos=" + contatos + '}';
    }

    
    
    
}
