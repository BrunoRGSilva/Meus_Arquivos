/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.agregacao;


/**
 *
 * @author DOM
 */
public class Contato {

    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }

    public void bloquear() {
        this.bloqueado = true;
    }

    public void desbloquear() {
        this.bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean isBloqueado() {
        return bloqueado;
    }

    @Override
    public String toString() {

        return String.format("Nome: %s\nTelefone: %s\nBloqueado %s",
                this.nome, this.telefone, (bloqueado ? "Esta bloqueado" : "Nao esta bloqueado"));
    }

}
