/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grupo.id;

import java.sql.*;

/**
 *
 * @author DOM
 */
public class Conexao {

    // com usuario e senha
    private final static String connUrl = "jdbc:sqlserver://grupo-8.database.windows.net:1433;database=kcode;"
            + "user=grupo-8;"
            + "password=#Gfkcode8;"
            + "encrypt=false;"
            + "trustServerCertificate=false;"
            + "hostNameInCertificate=*.database.windows.net;";
  
    private static Connection conexao;

    public static Connection conectar() throws SQLException {
        try {
            conexao = DriverManager.getConnection(connUrl, "grupo-8", "#Gfkcode8" + "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }

    public static void desconectar() {
        try {
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    
    
    
    
    
    
    
    
    
}
