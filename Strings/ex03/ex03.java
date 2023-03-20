package ex03;

/*
Adapte o exercício anterior para mostrar também a quantidade de vogais e espaços (caracter ‘ ‘). Dica: 
use toUpperCase() ou toLowerCase()
*/

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        char vogal;
        int contVogal = 0, contEsp = 0;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        nome = nome.toLowerCase();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        for (int i = 0; i < nome.length(); i++) {
            vogal = nome.charAt(i);

            if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
                contVogal++;
            }
        }

        for (int i = 0; i < nome.length(); i++) {
            vogal = nome.charAt(i);

            if (vogal == ' ') {
                contEsp++;
            }
        }

        System.out.println("Quantidade de vogais: " + contVogal);
        System.out.println("Quantidade de espaços: " + contEsp);

    }
}
