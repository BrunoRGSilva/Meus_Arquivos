/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encomendas;

/**
 *
 * @author DOM
 */
public class App {
    public static void main(String[] args) {
        
        Produtos produto1 = new Produtos();
        
        produto1.altura = 5.0;
        produto1.largura = 13.0;
        produto1.endereçoRemetente = "Rua nova, número 9 , Cantinho do céu";
        produto1.endereçoDestinatario = "Rua cairu, número 86, cantinho do céu";
        produto1.distancia = 40.0;
        produto1.valorEncomenda = 2.5;
        
        
        produto1.emitirEtiqueta();
        
        
        
        
        
        
        
        
    }
}
