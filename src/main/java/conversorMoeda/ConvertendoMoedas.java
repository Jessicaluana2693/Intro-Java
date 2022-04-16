package conversorMoeda;

import java.util.Random;
import java.util.Scanner;

public class ConvertendoMoedas {
    public static void main (String[] args){

        Scanner escolha = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("M E N U   D E   O P Ç Õ E S");
        System.out.println("[1] - Converter Dolar para Real");
        System.out.println("[2] - Converter Dolar Canadense para Real");
        System.out.println("[3] - Converter Euro para Real");
        System.out.println("Por favor digite sua opção: ");
        int opcaoEscolhida = Integer.parseInt(escolha.next());

        switch (opcaoEscolhida){
            case 1:
                System.out.println("Convertendo Dolar para Real...");
                converteDolarEmReal();
                break;
            case 2:
                System.out.println("Convertendo Dolar Canadense para Real...");
                converteDolarCAemReal();
                break;
            case 3:
                System.out.println("Convertendo de Euro para Real...");
                converteEuroEmReal();
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }
    }

    public static void converteDolarEmReal(){

        double cotacao, valorReal, valorDaConversao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a cotação do Dolar hoje? ");
        cotacao = entrada.nextDouble();

        System.out.println("Qual o valor em dolar? ");
        valorReal = entrada.nextDouble();

        valorDaConversao = cotacao * valorReal;
        System.out.println("O valor em reais será: "+ valorDaConversao + "\n");
    }

    public static void converteDolarCAemReal(){
        double cotacao, valorReal, valorDaConversao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a cotação do Dolar Canadense hoje? ");
        cotacao = entrada.nextDouble();

        System.out.println("Qual o valor em dolar? ");
        valorReal = entrada.nextDouble();

        valorDaConversao = cotacao * valorReal;
        System.out.println("O valor em reais será: "+ valorDaConversao + "\n");
    }

    public static void converteEuroEmReal(){
        double cotacao, valorReal, valorDaConversao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a cotação do euro hoje? ");
        cotacao = entrada.nextDouble();

        System.out.println("Qual o valor em euro? ");
        valorReal = entrada.nextDouble();

        valorDaConversao = cotacao * valorReal;
        System.out.println("O valor em reais será: "+ valorDaConversao + "\n");
    }

    }


