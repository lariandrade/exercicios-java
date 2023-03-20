package ex04;

/*
 Faça um programa que receba 2 palavras do usuário e verifica se ambas são iguais, seguinte a 
sequência:
• Primeiro deve ser verificado se ambas possuem o mesmo tamanho, caso não seja mostrar uma 
mensagem de erro. 
• Se tiverem o mesmo tamanho, verificar se são iguais somente comparando os caracteres (sem 
diferenciar maiúsculas e minúsculas), se não forem iguais mostre uma mensagem de erro.
• Por último comparar se são exatamente iguais, ou seja, considerando as maiúsculas e minúsculas
*/

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String p1, p2;
        int tam1 = 0, tam2 = 0;

        System.out.print("Digite uma palavra: ");
        p1 = entrada.nextLine();

        System.out.print("Digite outra palavra: ");
        p2 = entrada.nextLine();

        tam1 = p1.length();
        tam2 = p2.length();

        if (tam1 == tam2) {
            if (p1.equalsIgnoreCase(p2)) {
                if (p1.equals(p2)) {
                    System.out.print("São exatamente iguais.");
                } else {
                    System.out.print("Não exatamente iguais mas possuem os mesmos caracteres.");
                }
            } else {
                System.out.print("Mesmo tamanho mas não possuem os mesmos caracteres.");
            }
        } else {
            System.out.print("Palavras não possuem o mesmo tamanho.");
        }

    }
}
