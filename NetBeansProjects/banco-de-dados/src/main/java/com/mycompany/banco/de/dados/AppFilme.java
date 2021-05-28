/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco.de.dados;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author DOM
 */
public class AppFilme {

    public static void main(String[] args) {

        Conexao con = new Conexao();

        JdbcTemplate template = new JdbcTemplate(con.getBanco());

        List resultados = template.queryForList("SELECT * FROM filme");

        System.out.println(resultados);

        List<Filme> filme1 = template.query("SELECT * FROM filme", new BeanPropertyRowMapper<>(Filme.class));

        for (Filme filme : filme1) {
            System.out.println(filme);
        }

        template.update("UPDATE filme SET genero = ? WHERE id = ?", "Ficção", 1);

        System.out.println("--> Listando depois de alterar um filme");

        List<Filme> filme2 = template.query("SELECT * FROM filme", new BeanPropertyRowMapper<>(Filme.class));

        for (Filme filme : filme2) {
            System.out.println(filme);
        }

            template.update("DELETE FROM filme WHERE id = ?", 3);

            List<Filme> filme3 = template.query("SELECT * FROM filme", new BeanPropertyRowMapper<>(Filme.class));

            for (Filme filme : filme3) {
                System.out.println(filme);

            }
        }

    }

