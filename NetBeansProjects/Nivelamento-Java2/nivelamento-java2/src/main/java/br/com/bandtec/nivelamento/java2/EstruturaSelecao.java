package br.com.bandtec.nivelamento.java2;

import java.util.Scanner;

public class EstruturaSelecao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        /*
            Exemplo de uso de 'Switch':
        
            Funciona de maneira semelhante ao 'if, else if e else'
            
            Lembre-se de sempre colocar o break para interromper o comando e
            sempre colocar o 'default' para cobrir o 'caso não coberto' pelo código(else).
        */
        
        
        System.out.println("Digite um número entre 1 a 7:");
        Integer numeroDigitado = leitor.nextInt();

        switch (numeroDigitado) {
            case 1:
                System.out.println("Domingão");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado animado com gilberto barros");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }

        System.out.println("Digite o nome de um professor:");
        String nomeDigitado = leitorTexto.nextLine();

        switch (nomeDigitado) {
            case "Frizza":
                System.out.println("Upalalala");
                break;
            case "Gerson":
                System.out.println("Saudações");
                break;
            case "Yoshi":
                System.out.println("Tommaaaaa!");
                break;
            default:
                System.out.println("Não encontrou o professor mencionado.");
                break;
        }

        System.out.println("Digite a sua colocação na competição:");
        Integer numero = leitor.nextInt();

        switch (numero) {
            case 1:
                System.out.println("MacBook Pro");
            case 2:
                System.out.println("Iphone 12");
            case 3:
                System.out.println("Ipod");
                break;
            default:
                System.out.println("não ganhou");
        }
    }
}
