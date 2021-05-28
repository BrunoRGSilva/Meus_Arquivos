
package br.com.bandtec.nivelamento.java2;

import java.util.concurrent.ThreadLocalRandom;


public class NumerosAleatorios {
    
    public static void main(String[] args) {
        
        /*
            Para gerar numeros aleatorios em Java temos diversas opçoes ou maneiras:

            Math.random() -> semelhante ao que usavamos em Javascript.
            Esse método sempre devolverá um Double.
            
                Exemplo:
                    Double random = Math.random() * 10; 

                Para transformar o tipo do valor gerado para inteiro, devemos usar uma
                técnica chamada "Casting".

                Exemplo para gerar numeros inteiros:
                    Integer random = (int) (Math.random() * 10);

            Random gerador = new Random(); -> Classe Random, vista na ultima aula,
            que e "mais" facil mas ainda temos que fazer alguns calculos dependendo do contexto.

                Exemplo:
                    System.out.println(gerador.nextInt(10));
                    System.out.println(gerador.nextDouble() * 10);
        */


        /* 
            Exemplo de criaçao de numeros aleatorios "modo easy"
        
            Exemplo de criaçao de numero inteiro aleatorio
            os parametros 0 e 10 indicam o intervalo do numero a ser gerado, ou seja,
            ira sortear 1 numero entre 0 e 09.
        */
        
        Integer numeroInteiro = ThreadLocalRandom.current().nextInt(0, 10);

        // Exibindo o valor gerado
        System.out.println("Numero inteiro gerado: " + numeroInteiro);

        // A mesma regra se aplica ao Double
        
        // Exemplo de ciraçao de numero real aleatorio
        Double numeroReal = ThreadLocalRandom.current().nextDouble(0, 10);
        System.out.println("Numero real gerado: " + numeroReal);
        
    }
}
