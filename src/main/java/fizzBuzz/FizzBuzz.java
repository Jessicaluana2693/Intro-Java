package fizzBuzz;

import java.util.Scanner;

// Escreva um programa que mostre números de 1 a n.
    // Para os múltiplos de 3 mostre Fizz;
    // Para os múltiplos de 5 mostre Buzz;
    // Para números que sejam múltiplos de 3 e 5 mostre FizzBuzz.
public class FizzBuzz {

    public static void main(String[] args){
        int i;

        Scanner numero = new Scanner(System.in);
        System.out.println("Até qual número vc quer que a contagem alcance? ");
        int n = numero.nextInt();
        System.out.println("O numero limite é: " + n);
        numero.close();

        for(i=1;i<=n;i++){
            if(i % 3 == 0)
                System.out.println("Fizz");

            if(i % 5 == 0)
                System.out.println("Buzz");

           if (i % 3 == 0 & i % 5 == 0)
                System.out.println("FizzBuzz");

            else
                System.out.println(i);
        }
    }
}
