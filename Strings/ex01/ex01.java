package ex01;

/*
Faça um programa que receba uma frase digitada pelo usuário e informe qual é o tamanho dela em 
caracteres
*/

import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase;
        int tam = 0;
    
        System.out.println("Digite uma frase: ");
        frase = entrada.nextLine();

       tam = frase.length();

       System.out.println("A frase digitada tem: " + tam + " caracteres.");

    }
}
