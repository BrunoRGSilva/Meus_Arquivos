/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.de.dados;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author DOM
 */
public class Conexao {

    private BasicDataSource banco;

    public Conexao() {
        this.banco = new BasicDataSource();
        banco.setDriverClassName("org.h2.Driver");
        banco.setUrl("jdbc:h2:file:./meu_banco");
        banco.setUsername("sa");
        banco.setPassword("");

    }

    public BasicDataSource getBanco() {
        return banco;
    }
    
}
