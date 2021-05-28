/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.de.dados;

/**
 *
 * @author DOM
 */
public class Filme {
    
    private Integer id;
    private String nome;
    private String genero;
    private Integer ano;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Filme{id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", genero=").append(genero);
        sb.append(", ano=").append(ano);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
}
