/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.variacao.ac2;

/**
 *
 * @author DOM
 */
public class Aluno {

    private Integer ra = 0;
    private String nome;
    private String ativo;
    private String inadimplente;
    private Double media = 0.0;

    public Aluno(String nome, String ativo, String inadimplente) {
        this.nome = nome;
        this.ativo = ativo;
        this.inadimplente = inadimplente;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getInadimplente() {
        return inadimplente;
    }

    public void setInadimplente(String inadimplente) {
        this.inadimplente = inadimplente;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public void caucularMedia(Double nota1, Double nota2) {

        media = (nota1 * 0.4) + (nota2 * 0.6);

    }
}
