/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.em.sala;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOM
 */
public class Departamento {

    private List<VendedorComissao> lista;

    public Departamento() {
        lista = new ArrayList<>();
    }

    public void adicionaVendedor(VendedorComissao v) {
        lista.add(v);
    }

    
    public Double calculaTotalSalario(){
    
    Double total = 0.0;
        for (VendedorComissao v : lista) {
          total += v.calcularSalario();   
        }
        return total;
    }

    public void exibeTodos(){
    
    for (VendedorComissao v : lista){
        System.out.println(v);
    }
    
    }
    
  
    
}
