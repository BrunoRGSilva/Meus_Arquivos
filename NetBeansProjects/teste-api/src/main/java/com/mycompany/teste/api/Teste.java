/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.api;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;

/**
 *
 * @author DOM
 */
public class Teste {

    public static void main(String[] args) {

        Looca looca = new Looca();
        
    looca.getGrupoDeDiscos();
    looca.getGrupoDeProcessos();
    looca.getGrupoDeServicos();
    looca.getMemoria();
    looca.getProcessador();
   Sistema sistema = looca.getSistema();
    looca.getTemperatura();
    
        System.out.println(sistema);
    
    
}
}
