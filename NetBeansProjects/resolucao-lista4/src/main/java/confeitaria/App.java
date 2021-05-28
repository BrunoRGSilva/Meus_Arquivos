/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package confeitaria;

/**
 *
 * @author DOM
 */
public class App {

    public static void main(String[] args) {

        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();

        bolo1.sabor = "Chocolate";
        bolo1.valor = 10.00;

        bolo2.sabor = "Morango";
        bolo2.valor = 50.00;

        bolo3.sabor = "Abacaxi";
        bolo3.valor = 70.00;

        bolo1.comprarBolo(6);
        bolo1.comprarBolo(8);
        
        bolo2.comprarBolo(25);
        bolo2.comprarBolo(30);
        
        bolo3.comprarBolo(45);
        bolo3.comprarBolo(40);
        
        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();
        
    }

}
