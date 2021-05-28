/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.de.renota;

/**
 *
 * @author DOM
 */
public class Imovel {

    private Integer id;
    private String titulo;
    private String localizacao;
    private Integer comodos;
    private Double precoPorMetroQuadrado;

    public Imovel(Integer id, String titulo, String localizacao, Integer comodos, Double precoPorMetroQuadrado) {
        this.id = id;
        this.titulo = titulo;
        this.localizacao = localizacao;
        this.comodos = comodos;
        this.precoPorMetroQuadrado = precoPorMetroQuadrado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getComodos() {
        return comodos;
    }

    public void setComodos(Integer comodos) {
        this.comodos = comodos;
    }

    public Double getPrecoPorMetroQuadrado() {
        return precoPorMetroQuadrado;
    }

    public void setPrecoPorMetroQuadrado(Double precoPorMetroQuadrado) {
        this.precoPorMetroQuadrado = precoPorMetroQuadrado;
    }

    public Double getPrecoImovel() {

        Double precoImovel = precoPorMetroQuadrado;
        return precoImovel;

    }

    @Override
    public String toString() {
        return String.format(
                "id Imovel: %d \n"
                + "Titulo do Anúncio: %s\n"
                + "Localização: %s\n"
                + "Comodos: %d\n"
                + "Preço por metro quadrado: %.2f\n",
                this.id,
                this.titulo,
                this.localizacao,
                this.comodos,
                this.precoPorMetroQuadrado);

    }

}
